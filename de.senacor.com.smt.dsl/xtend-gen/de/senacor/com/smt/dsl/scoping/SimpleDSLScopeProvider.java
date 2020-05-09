package de.senacor.com.smt.dsl.scoping;

import de.senacor.com.smt.dsl.scoping.AbstractSimpleDSLScopeProvider;
import de.senacor.com.smt.utils.IGlobalResourceUtils;
import de.senacor.smt.model.smtmetamodel.Relationship;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SimpleDSLScopeProvider extends AbstractSimpleDSLScopeProvider {
  @Inject
  @Extension
  private IGlobalResourceUtils globalResourceUtils;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      if ((reference == SmtmetamodelPackage.Literals.RELATIONSHIP__TO_ENTITY)) {
        return this.getScopeForToEntity(((Relationship) context));
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  public SimpleScope getScopeForToEntity(final Relationship relationship) {
    final Iterable<IEObjectDescription> allEntities = this.globalResourceUtils.getAllEObjectDescriptionsOfType(relationship, SmtmetamodelPackage.Literals.ENTITY);
    return new SimpleScope(IScope.NULLSCOPE, allEntities);
  }
}
