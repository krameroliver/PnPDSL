package de.senacor.com.smt.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.senacor.smt.model.smtmetamodel.DataType;
import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.Field;
import de.senacor.smt.model.smtmetamodel.Relationship;
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
    CharSequence _genDeleteSAT = this.genDeleteSAT(entity);
    _builder.append(_genDeleteSAT);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("CREATE TABLE IF NOT EXISTS ");
    String _upperCase = entity.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SAT (");
    _builder.newLineIfNotEmpty();
    CharSequence _addCollumns = this.addCollumns(entity);
    _builder.append(_addCollumns);
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.append("ENGINE=InnoDB");
    _builder.newLine();
    _builder.append("DEFAULT CHARSET=utf8");
    _builder.newLine();
    _builder.append("COLLATE=utf8_general_ci;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("############seperatot###########");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    CharSequence _genDeleteHUB = this.genDeleteHUB(entity);
    _builder.append(_genDeleteHUB);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("CREATE TABLE IF NOT EXISTS ");
    String _upperCase_1 = entity.getName().toUpperCase();
    _builder.append(_upperCase_1);
    _builder.append("_HUB (");
    _builder.newLineIfNotEmpty();
    CharSequence _keyColls = this.keyColls(entity);
    _builder.append(_keyColls);
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    _builder.append("ENGINE=InnoDB");
    _builder.newLine();
    _builder.append("DEFAULT CHARSET=utf8");
    _builder.newLine();
    _builder.append("COLLATE=utf8_general_ci;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("############seperatot###########");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    CharSequence _addAlter = this.addAlter(entity);
    _builder.append(_addAlter);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    CharSequence _genLinks = this.genLinks(entity);
    _builder.append(_genLinks);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genLinks(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Relationship> _relationships = entity.getRelationships();
      for(final Relationship rel : _relationships) {
        _builder.append("DROP TABLE IF EXISTS LINK_");
        String _upperCase = rel.getName().toUpperCase();
        _builder.append(_upperCase);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("CREATE TABLE IF NOT EXISTS LINK_");
        String _upperCase_1 = rel.getName().toUpperCase();
        _builder.append(_upperCase_1);
        _builder.append(" (");
        _builder.newLineIfNotEmpty();
        _builder.append("HK_");
        String _upperCase_2 = entity.getName().toUpperCase();
        _builder.append(_upperCase_2);
        _builder.append(" VARCHAR(64),");
        _builder.newLineIfNotEmpty();
        {
          EList<Field> _fields = entity.getFields();
          for(final Field field : _fields) {
            {
              String _key = field.getKey();
              boolean _equals = Objects.equal(_key, "T");
              if (_equals) {
                String _upperCase_3 = field.getName().toUpperCase();
                _builder.append(_upperCase_3);
                _builder.append(" ");
                String _dataTypeString = this.getDataTypeString(field);
                _builder.append(_dataTypeString);
                {
                  Field _last = IterableExtensions.<Field>last(entity.getFields());
                  boolean _notEquals = (!Objects.equal(field, _last));
                  if (_notEquals) {
                    _builder.append(",");
                  } else {
                    _builder.append(" ");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        String _upperCase_4 = rel.getToEntity().getName().toUpperCase();
        _builder.append(_upperCase_4);
        _builder.append("_HK VARCHAR(64))");
        _builder.newLineIfNotEmpty();
        _builder.append("ENGINE=InnoDB");
        _builder.newLine();
        _builder.append("DEFAULT CHARSET=utf8");
        _builder.newLine();
        _builder.append("COLLATE=utf8_general_ci;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("############seperatot###########");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence genDeleteSAT(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP TABLE IF EXISTS ");
    String _upperCase = entity.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_SAT;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("############seperatot###########");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genDeleteHUB(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DROP TABLE IF EXISTS ");
    String _upperCase = entity.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("_HUB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("############seperatot###########");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence keyColls(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _fields = entity.getFields();
      for(final Field field : _fields) {
        {
          String _key = field.getKey();
          boolean _equals = Objects.equal(_key, "T");
          if (_equals) {
            _builder.append(" ");
            String _upperCase = field.getName().toUpperCase();
            _builder.append(_upperCase);
            _builder.append(" ");
            String _dataTypeString = this.getDataTypeString(field);
            _builder.append(_dataTypeString);
            _builder.newLineIfNotEmpty();
            {
              Field _last = IterableExtensions.<Field>last(entity.getFields());
              boolean _notEquals = (!Objects.equal(field, _last));
              if (_notEquals) {
                _builder.append(",");
              } else {
                _builder.append(" ");
              }
            }
            _builder.append("PRIMARY KEY( ");
            String _upperCase_1 = field.getName().toUpperCase();
            _builder.append(_upperCase_1);
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
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
          boolean _notEquals = (!Objects.equal(field, _last));
          if (_notEquals) {
            _builder.append(",");
          } else {
          }
        }
        _builder.newLineIfNotEmpty();
        {
          String _key = field.getKey();
          boolean _equals = Objects.equal(_key, "T");
          if (_equals) {
            _builder.append("PRIMARY KEY( ");
            String _upperCase_1 = field.getName().toUpperCase();
            _builder.append(_upperCase_1);
            _builder.append("),");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence addAlter(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _fields = entity.getFields();
      for(final Field field : _fields) {
        {
          String _key = field.getKey();
          boolean _equals = Objects.equal(_key, "T");
          if (_equals) {
            _builder.append("ALTER TABLE ");
            String _upperCase = entity.getName().toUpperCase();
            _builder.append(_upperCase);
            _builder.append("_SAT ADD CONSTRAINT ");
            String _upperCase_1 = field.getName().toUpperCase();
            _builder.append(_upperCase_1);
            _builder.append("_FOREIGN_KEY FOREIGN KEY  (");
            String _upperCase_2 = field.getName().toUpperCase();
            _builder.append(_upperCase_2);
            _builder.append(") REFERENCES ");
            String _upperCase_3 = entity.getName().toUpperCase();
            _builder.append(_upperCase_3);
            _builder.append("_HUB (");
            String _upperCase_4 = field.getName().toUpperCase();
            _builder.append(_upperCase_4);
            _builder.append(") ON DELETE CASCADE ON UPDATE CASCADE;");
          }
        }
        _builder.newLineIfNotEmpty();
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
          _builder_1.append("DECIMAL(");
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
