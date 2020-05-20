package de.senacor.com.smt.dsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javax.inject.Inject
import de.senacor.smt.model.smtmetamodel.Entity
import org.eclipse.xtext.service.AllRulesCache.AllRulesCacheAdapter
import de.senacor.smt.model.smtmetamodel.Field
import de.senacor.smt.model.smtmetamodel.DataType
import de.senacor.smt.model.smtmetamodel.Includes

class SQLDDLGenerator extends AbstractGenerator {

	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			val path = "sql/create_stmts/"+entity.name.toUpperCase+".SQL"
			fsa.generateFile(path,entity.compile)
		}
	}
	
	def compile(Entity entity) 
	''' 
	«entity.genDeleteSAT»
	
	
	CREATE TABLE IF NOT EXISTS SAT_«entity.name.toUpperCase» (
	«entity.addCollumns»
	)
	ENGINE=InnoDB
	DEFAULT CHARSET=utf8
	COLLATE=utf8_general_ci;

	«entity.genDeleteHUB»
	
	CREATE TABLE IF NOT EXISTS HUB_«entity.name.toUpperCase» (
	   «entity.keyColls»
	)
	ENGINE=InnoDB
	DEFAULT CHARSET=utf8
	COLLATE=utf8_general_ci;
	
	--«entity.addAlter»
	
	«entity.generateIncludes»

	«entity.genLinks»

	'''//strg + <
	
	def genLinks(Entity entity)
	'''
	«FOR rel : entity.relationships»
	DROP TABLE IF EXISTS LINK_«rel.name.toUpperCase»;
	CREATE TABLE IF NOT EXISTS LINK_«rel.name.toUpperCase» (
	HK_«entity.name.toUpperCase» VARCHAR(64),
	«FOR field : entity.fields»
		«IF field.key=='T'»   «field.name.toUpperCase» «field.getDataTypeString»«IF field != entity.fields.last»,«ELSE» «ENDIF»
		«ENDIF»
	«ENDFOR»
	«rel.toEntity.name.toUpperCase»_HK VARCHAR(64))
	ENGINE=InnoDB
	DEFAULT CHARSET=utf8
	COLLATE=utf8_general_ci;
	«ENDFOR»	
	'''

	
	
	def genDeleteSAT(Entity entity)
	'''
	DROP TABLE IF EXISTS SAT_«entity.name.toUpperCase»;
	'''
	
	def genDeleteHUB(Entity entity)
	'''
	DROP TABLE IF EXISTS HUB_«entity.name.toUpperCase»;
	'''
	
	
	def keyColls(Entity entity)
	'''
		«FOR field : entity.fields»
			«IF field.key=='T'» «field.name.toUpperCase» «field.getDataTypeString»«IF field != entity.fields.last»,«ENDIF»
			PRIMARY KEY( «field.name.toUpperCase»)«ENDIF»
		«ENDFOR»
	'''
	
	def addCollumns(Entity entity)'''
		«FOR field : entity.fields»
			«field.name.toUpperCase» «field.dataTypeString»«IF field != entity.fields.last»,«ELSE»«ENDIF»
			«IF field.key=='T'»PRIMARY KEY( «field.name.toUpperCase»),
			«ENDIF»
		«ENDFOR»
		'''
	def addAlter(Entity entity)'''
		«FOR field : entity.fields»
	    	«IF field.key=='T'»ALTER TABLE «entity.name.toUpperCase»_SAT ADD CONSTRAINT «field.name.toUpperCase»_FOREIGN_KEY FOREIGN KEY  («field.name.toUpperCase») REFERENCES «entity.name.toUpperCase»_HUB («field.name.toUpperCase») ON DELETE CASCADE ON UPDATE CASCADE;«ENDIF»
		«ENDFOR»
	'''
	
	def getDataTypeString(Field field){
		switch(field.type){
			case DataType.STRING: return '''VARCHAR(«field.length»)'''
			case DataType.NUMBER: return '''DECIMAL(«field.preciscion», «field.scale»)'''
			case DataType.DATE: return '''DATE'''
			default: throw new IllegalStateException 
		}
	}
	
	def generateIncludes(Entity entity)
	'''
	«FOR include : entity.includes»	
	DROP TABLE IF EXISTS SAT_«entity.name.toUpperCase»_«include.name.toUpperCase»;
	CREATE TABLE IF NOT EXISTS SAT_«entity.name.toUpperCase»_«include.name.toUpperCase» (
	«FOR field : include.fields»
	«field.name.toUpperCase» «field.dataTypeString»«IF field != entity.fields.last»,«ELSE»«ENDIF»
	«ENDFOR»
	HK_«entity.name.toUpperCase» VARCHAR(64))
	ENGINE=InnoDB
	DEFAULT CHARSET=utf8
	COLLATE=utf8_general_ci;
	
	«ENDFOR»
	'''
	
}