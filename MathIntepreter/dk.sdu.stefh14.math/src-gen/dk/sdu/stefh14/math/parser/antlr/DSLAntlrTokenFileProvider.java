/*
 * generated by Xtext 2.13.0
 */
package dk.sdu.stefh14.math.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("dk/sdu/stefh14/math/parser/antlr/internal/InternalDSL.tokens");
	}
}
