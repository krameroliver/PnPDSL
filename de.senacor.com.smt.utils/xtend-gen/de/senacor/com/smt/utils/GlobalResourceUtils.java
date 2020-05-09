package de.senacor.com.smt.utils;

import de.senacor.com.smt.utils.IGlobalResourceUtils;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescriptionsProvider;

@SuppressWarnings("all")
public class GlobalResourceUtils implements IGlobalResourceUtils {
  @Inject
  private IResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Override
  public Iterable<IEObjectDescription> getAllEObjectDescriptionsOfType(final EObject from, final EClass type) {
    final IResourceDescriptions resourceDescs = this.resourceDescriptionsProvider.getResourceDescriptions(from.eResource().getResourceSet());
    return resourceDescs.getExportedObjectsByType(type);
  }
}
