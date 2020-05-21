package de.senacor.com.smt.utils

import de.senacor.com.smt.utils.IGlobalResourceUtils
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import javax.inject.Inject
import org.eclipse.xtext.resource.IResourceDescriptionsProvider

class GlobalResourceUtils implements IGlobalResourceUtils {
	
	@Inject IResourceDescriptionsProvider resourceDescriptionsProvider
	
	override getAllEObjectDescriptionsOfType(EObject from, EClass type) {
		val resourceDescs = resourceDescriptionsProvider.getResourceDescriptions(from.eResource.resourceSet)
		return resourceDescs.getExportedObjectsByType(type)
	}
	
}