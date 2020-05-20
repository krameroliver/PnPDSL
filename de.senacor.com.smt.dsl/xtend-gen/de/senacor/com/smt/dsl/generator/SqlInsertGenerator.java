package de.senacor.com.smt.dsl.generator;

import com.google.common.collect.Iterables;
import de.senacor.smt.model.smtmetamodel.Entity;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SqlInsertGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      {
        String _upperCase = entity.getName().toUpperCase();
        String _plus = ("sql/insert_stmts/" + _upperCase);
        final String path = (_plus + ".SQL");
        fsa.generateFile(path, this.compile(entity));
      }
    }
  }
  
  public CharSequence compile(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
