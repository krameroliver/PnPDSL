/*
 * generated by Xtext 2.20.0
 */
package de.senacor.com.smt.dsl.tests

import com.google.inject.Inject
import de.senacor.smt.model.smtmetamodel.Document
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(SimpleDSLInjectorProvider)
class SimpleDSLParsingTest {
	@Inject
	ParseHelper<Document> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}