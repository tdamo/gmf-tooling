/*
 * Copyright (c) 2005, 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *    Radek Dvorak (Borland) - initial API and implementation
 *    Artem Tikhomirov (Borland) - refactoring
 */
package org.eclipse.gmf.internal.validate;

import java.util.Map;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.gmf.validate.ValidationOptions;


public abstract class AbstractValidator implements EValidator {
	static final String DIAGNOSTIC_SOURCE = "org.eclipse.gmf.validation"; //$NON-NLS-1$

	protected AbstractValidator() {
	}
	
	protected static SubstitutionLabelProvider getLabelProvider(Map<Object, Object> context) {
		if(context != null && context.containsKey(SubstitutionLabelProvider.class)) {
			Object provider = context.get(SubstitutionLabelProvider.class);
			assert provider instanceof SubstitutionLabelProvider : "Invalid label provider"; //$NON-NLS-1$ 
			return (SubstitutionLabelProvider)provider;
		}
		return LabelProvider.INSTANCE;
	}

	/**
	 * @return Validation options for the given context. If not options is set to context,
	 * 	the {@link ValidationOptions#getDefault()} default options } are returned.
	 */
	static ValidationOptions getOptions(Map<Object, Object> context) {
		if(context != null) {
			ValidationOptions options = (ValidationOptions)context.get(ValidationOptions.class);
			return options != null ? options : ValidationOptions.getDefault();
		}
		return ValidationOptions.getDefault();
	}
		
	/**
	 * 
	 * @param options
	 * @param context
	 * @throws IllegalArgumentException
	 */
	static void setOptions(ValidationOptions options, Map<Object, Object> context) {
		if(context == null) {
			throw new IllegalArgumentException("Null validation options"); //$NON-NLS-1$
		}
		if(options.isUseGmfLabelSubtitution()) {
			context.put(SubstitutionLabelProvider.class, LabelProvider.INSTANCE);
		}
		context.put(ValidationOptions.class, options);
	}	
}
