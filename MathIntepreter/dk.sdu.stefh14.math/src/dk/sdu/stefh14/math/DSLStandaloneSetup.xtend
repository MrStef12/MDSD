/*
 * generated by Xtext 2.13.0
 */
package dk.sdu.stefh14.math


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DSLStandaloneSetup extends DSLStandaloneSetupGenerated {

	def static void doSetup() {
		new DSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
