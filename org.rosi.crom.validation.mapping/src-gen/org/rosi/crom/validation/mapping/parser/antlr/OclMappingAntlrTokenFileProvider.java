/*
 * generated by Xtext 2.14.0
 */
package org.rosi.crom.validation.mapping.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class OclMappingAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/rosi/crom/validation/mapping/parser/antlr/internal/InternalOclMapping.tokens");
	}
}
