package de.senacor.com.smt.dsl.validation;

import com.google.common.base.Objects;
import de.senacor.com.smt.dsl.validation.AbstractSimpleDSLValidator;
import de.senacor.com.smt.utils.IGlobalResourceUtils;
import de.senacor.smt.model.smtmetamodel.DataType;
import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.Field;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage;
import javax.inject.Inject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SimpleDSLValidator extends AbstractSimpleDSLValidator {
  @Inject
  @Extension
  private IGlobalResourceUtils globalResourceUtils;
  
  @Inject
  @Extension
  private IQualifiedNameProvider qualifiedNameProvider;
  
  @Check
  public void checkDataType(final Field field) {
    if (((field.getType() == DataType.STRING) && (field.getLength() == 0))) {
      this.error("Fields of type STRING must have a lenght specified", SmtmetamodelPackage.Literals.FIELD__TYPE);
    }
    if (((field.getType() == DataType.STRING) && ((field.getPreciscion() != 0) || (field.getScale() != 0)))) {
      this.error("Fields of type STRING may not have precision or scale specified", SmtmetamodelPackage.Literals.FIELD__TYPE);
    }
    DataType _type = field.getType();
    boolean _tripleEquals = (_type == DataType.NOT_SET);
    if (_tripleEquals) {
      this.error("Fields must have a type specified", SmtmetamodelPackage.Literals.NAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkEntityNameIsGloballyUnique(final Entity entity) {
    Iterable<IEObjectDescription> _allEObjectDescriptionsOfType = this.globalResourceUtils.getAllEObjectDescriptionsOfType(entity, SmtmetamodelPackage.Literals.ENTITY);
    for (final IEObjectDescription objDesc : _allEObjectDescriptionsOfType) {
      if ((Objects.equal(entity.getName(), objDesc.getName().getLastSegment()) && (!Objects.equal(this.qualifiedNameProvider.getFullyQualifiedName(entity), objDesc.getName())))) {
        this.error("Entity name must be globally unique", SmtmetamodelPackage.Literals.NAMED_ELEMENT__NAME);
      }
    }
  }
}
