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

class SQLDDLGenerator extends AbstractGenerator {

	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			val path = "sql/"+entity.name.toUpperCase+".SQL"
			fsa.generateFile(path,entity.compile)
		}
	}
	
	def compile(Entity entity) ''' 
		CREATE TABLE «entity.name.toUpperCase» (
			«entity.addCollumns»
		) 
	'''//strg + <
	
	def addCollumns(Entity entity)'''
		«FOR field : entity.fields»
			«field.name.toUpperCase» «field.dataTypeString»«IF field !== entity.fields.last»«ENDIF»,	«ENDFOR»'''
	
	def getDataTypeString(Field field){
		switch(field.type){
			case DataType.STRING: return '''VARCHAR(«field.length»)'''
			case DataType.NUMBER: return '''NUMBER(«field.preciscion», «field.scale»)'''
			case DataType.DATE: return '''DATE'''
			default: throw new IllegalStateException 
		}
	}
	
}