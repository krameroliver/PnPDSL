package de.senacor.com.smt.utils

import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import com.google.inject.ImplementedBy

@ImplementedBy(GlobalResourceUtils)
interface IGlobalResourceUtils {
	
	def Iterable<IEObjectDescription> getAllEObjectDescriptionsOfType(EObject from, EClass type)
	
}