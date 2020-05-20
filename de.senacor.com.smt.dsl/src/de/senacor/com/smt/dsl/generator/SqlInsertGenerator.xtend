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

class SqlInsertGenerator extends AbstractGenerator {

	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(entity : input.allContents.toIterable.filter(Entity)){
			val path = "sql/insert_stmts/"+entity.name.toUpperCase+".SQL"
			fsa.generateFile(path,entity.compile)
		}
	}
	
	def compile(Entity entity) 
	'''
	
	'''
	
}