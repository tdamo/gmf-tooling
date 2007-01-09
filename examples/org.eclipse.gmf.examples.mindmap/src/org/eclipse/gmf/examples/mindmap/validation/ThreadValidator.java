/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThreadValidator.java,v 1.1 2007/01/09 17:20:50 rgronback Exp $
 */
package org.eclipse.gmf.examples.mindmap.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.examples.mindmap.Resource;

/**
 * A sample validator interface for {@link org.eclipse.gmf.examples.mindmap.Thread}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ThreadValidator {
	boolean validate();

	boolean validateItems(EList value);
	boolean validateAuthor(Resource value);
	boolean validatePostDate(Object value);
	boolean validateSubject(String value);
}
