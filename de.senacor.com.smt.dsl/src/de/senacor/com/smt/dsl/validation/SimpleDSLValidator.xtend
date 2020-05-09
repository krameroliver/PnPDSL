package de.senacor.com.smt.dsl.validation

import de.senacor.com.smt.dsl.validation.AbstractSimpleDSLValidator
import org.eclipse.xtext.validation.Check
import de.senacor.smt.model.smtmetamodel.Field
import de.senacor.smt.model.smtmetamodel.DataType
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage
import de.senacor.smt.model.smtmetamodel.Entity
import javax.inject.Inject
import de.senacor.com.smt.utils.IGlobalResourceUtils
import org.eclipse.xtext.naming.IQualifiedNameProvider

class SimpleDSLValidator extends AbstractSimpleDSLValidator {
	
	@Inject extension IGlobalResourceUtils globalResourceUtils
	
	@Inject extension IQualifiedNameProvider qualifiedNameProvider
	
	@Check
	def checkDataType(Field field) {
		if (field.type === DataType.STRING && (field.length == 0)) {
			error("Fields of type STRING must have a lenght specified", SmtmetamodelPackage.Literals.FIELD__TYPE)
		}
		if (field.type === DataType.STRING && (field.preciscion != 0 || field.scale != 0)) {
			error("Fields of type STRING may not have precision or scale specified", SmtmetamodelPackage.Literals.FIELD__TYPE)
		}
		
		if (field.type === DataType.NOT_SET) {
			error("Fields must have a type specified", SmtmetamodelPackage.Literals.NAMED_ELEMENT__NAME)
		}
	}
	
	@Check
	def checkEntityNameIsGloballyUnique(Entity entity) {
		for (objDesc : entity.getAllEObjectDescriptionsOfType(SmtmetamodelPackage.Literals.ENTITY)) {
			if (entity.name == objDesc.name.lastSegment && entity.fullyQualifiedName != objDesc.name) {
				error("Entity name must be globally unique", SmtmetamodelPackage.Literals.NAMED_ELEMENT__NAME)
			}
		}
	}
}