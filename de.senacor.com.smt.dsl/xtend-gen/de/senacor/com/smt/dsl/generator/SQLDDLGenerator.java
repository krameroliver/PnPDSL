package de.senacor.com.smt.dsl.generator;

import com.google.common.collect.Iterables;
import de.senacor.smt.model.smtmetamodel.DataType;
import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.Field;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SQLDDLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        String _upperCase = entity.getName().toUpperCase();
        String _plus = ("sql/" + _upperCase);
        final String path = (_plus + ".SQL");
        fsa.generateFile(path, this.compile(entity));
      }
    }
  }
  
  public CharSequence compile(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _upperCase = entity.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append(" (");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _addCollumns = this.addCollumns(entity);
    _builder.append(_addCollumns, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(") ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence addCollumns(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _fields = entity.getFields();
      for(final Field field : _fields) {
        String _upperCase = field.getName().toUpperCase();
        _builder.append(_upperCase);
        _builder.append(" ");
        String _dataTypeString = this.getDataTypeString(field);
        _builder.append(_dataTypeString);
        {
          Field _last = IterableExtensions.<Field>last(entity.getFields());
          boolean _tripleNotEquals = (field != _last);
          if (_tripleNotEquals) {
          }
        }
        _builder.append(",\t");
      }
    }
    return _builder;
  }
  
  public String getDataTypeString(final Field field) {
    DataType _type = field.getType();
    if (_type != null) {
      switch (_type) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("VARCHAR(");
          int _length = field.getLength();
          _builder.append(_length);
          _builder.append(")");
          return _builder.toString();
        case NUMBER:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("NUMBER(");
          int _preciscion = field.getPreciscion();
          _builder_1.append(_preciscion);
          _builder_1.append(", ");
          int _scale = field.getScale();
          _builder_1.append(_scale);
          _builder_1.append(")");
          return _builder_1.toString();
        case DATE:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("DATE");
          return _builder_2.toString();
        default:
          throw new IllegalStateException();
      }
    } else {
      throw new IllegalStateException();
    }
  }
}
