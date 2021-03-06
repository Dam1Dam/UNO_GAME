/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.myDsl.UNO_DamienCantin

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<UNO_DamienCantin> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Uno game test1:
			
			Base: Points - Cry Uno
			
			Variants: Exchange Card - Special Cards: Card Bomb / WildCard: Roulette
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
		System.out.println(result);
	}
}
