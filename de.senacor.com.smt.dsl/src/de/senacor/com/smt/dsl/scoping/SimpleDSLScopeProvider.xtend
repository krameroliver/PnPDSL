package de.senacor.com.smt.dsl.scoping

import de.senacor.com.smt.dsl.scoping.AbstractSimpleDSLScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage
import de.senacor.smt.model.smtmetamodel.Relationship
import de.senacor.com.smt.utils.IGlobalResourceUtils
import javax.inject.Inject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope

class SimpleDSLScopeProvider extends AbstractSimpleDSLScopeProvider {
	
	@Inject extension IGlobalResourceUtils globalResourceUtils
	
	override getScope(EObject context, EReference reference){
		if(reference === SmtmetamodelPackage.Literals.RELATIONSHIP__TO_ENTITY){
			return getScopeForToEntity(context as Relationship)
		}
		super.getScope(context, reference)
	}
	
	def getScopeForToEntity(Relationship relationship){
		
		val allEntities = relationship.getAllEObjectDescriptionsOfType(SmtmetamodelPackage.Literals.ENTITY)
		return new SimpleScope(IScope.NULLSCOPE,allEntities)
	}
	
}