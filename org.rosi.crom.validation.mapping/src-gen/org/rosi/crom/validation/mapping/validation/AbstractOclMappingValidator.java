/*
 * generated by Xtext 2.14.0
 */
package org.rosi.crom.validation.mapping.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractOclMappingValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.rosi.crom.validation.mapping.oclMapping.OclMappingPackage.eINSTANCE);
		return result;
	}
}
