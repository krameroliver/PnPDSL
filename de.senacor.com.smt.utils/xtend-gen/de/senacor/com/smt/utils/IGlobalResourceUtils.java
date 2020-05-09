package de.senacor.com.smt.utils;

import com.google.inject.ImplementedBy;
import de.senacor.com.smt.utils.GlobalResourceUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;

@ImplementedBy(GlobalResourceUtils.class)
@SuppressWarnings("all")
public interface IGlobalResourceUtils {
  public abstract Iterable<IEObjectDescription> getAllEObjectDescriptionsOfType(final EObject from, final EClass type);
}
