/*
 * generated by Xtext 2.13.0
 */
package dk.sdu.stefh14.math.ide

import com.google.inject.Guice
import dk.sdu.stefh14.math.DSLRuntimeModule
import dk.sdu.stefh14.math.DSLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DSLIdeSetup extends DSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DSLRuntimeModule, new DSLIdeModule))
	}
	
}
