/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.graphdef.codegen;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.ImportAssistant;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.internal.common.codegen.TextEmitter;
import org.eclipse.gmf.internal.graphdef.codegen.Activator;
import org.eclipse.gmf.internal.xpand.BufferOutput;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.XpandFacade;
import org.eclipse.gmf.internal.xpand.expression.Variable;
import org.eclipse.gmf.internal.xpand.util.ContextFactory;

public class FigureGenerator implements TextEmitter {

	private static final String VAR_MM_ACCESS = "mapModeAccessor";
	private static final String VAR_OUTPUT_FIELDS = "outputStaticFields";
	private static final String VAR_OUTPUT_METHODS = "outputAdditionalMethods";
	private static final String VAR_PACKAGE_STMT = "packageStatement";
	private static final String VAR_RT_TOKEN = "runtimeToken";

	private static final String SLOT_FIELDS = "staticFields";
	private static final String SLOT_METHODS = "additionalMethods";

	private final XpandFacade xpandFacade;

	private final StringBuilder result;

	private Variable packageStatement;

	private StringBuilder additionalMethods;

	private final boolean myIsInnerClassCode;

	private StringBuilder additionalFields;


	/**
	 * XXX consider using enum for runtimeToken
	 * @param runtimeToken either "full" or null to indicate full GMF runtime use, any other value is to be processed by custom templates 
	 * @param asInnerClass
	 */
	public FigureGenerator(String runtimeToken, boolean asInnerClass) {
		this(runtimeToken, MapModeCodeGenStrategy.DYNAMIC, "getMapMode().", asInnerClass);
	}

	public FigureGenerator(String runtimeToken, MapModeCodeGenStrategy mapModeStrategy, String mapModeAccessor, boolean asInnerClass) {
		this(runtimeToken, mapModeStrategy, mapModeAccessor, asInnerClass, null);
	}

	public FigureGenerator(String runtimeToken, MapModeCodeGenStrategy mapModeStrategy, String mapModeAccessor, boolean asInnerClass, URL[] dynamicTemplates) {
		myIsInnerClassCode = asInnerClass;
		if (mapModeStrategy == MapModeCodeGenStrategy.STATIC) {
			if (mapModeAccessor != null && mapModeAccessor.trim().length() > 0) {
				throw new IllegalArgumentException("Can't use map mode accessor with identity map mode");
			}
		}
		final ArrayList<Variable> globals = new ArrayList<Variable>();
		if (mapModeStrategy == MapModeCodeGenStrategy.DYNAMIC) {
			globals.add(new Variable(VAR_MM_ACCESS, mapModeAccessor == null ? "" : mapModeAccessor));
		}
		if (runtimeToken != null) {
			globals.add(new Variable(VAR_RT_TOKEN, runtimeToken));
		}
		packageStatement = new Variable(VAR_PACKAGE_STMT, "");
		globals.add(packageStatement);
		additionalMethods = new StringBuilder();
		globals.add(new Variable(VAR_OUTPUT_METHODS, "") {
			public Object getValue() {
				return additionalMethods.toString();
			}
		});
		additionalFields = new StringBuilder();
		globals.add(new Variable(VAR_OUTPUT_FIELDS, "") {
			public Object getValue() {
				return additionalFields.toString();
			}
		});
		result = new StringBuilder(200);
		Map<String, StringBuilder> slots = new HashMap<String, StringBuilder>();
		slots.put(SLOT_METHODS, additionalMethods);
		slots.put(SLOT_FIELDS, additionalFields);
		BufferOutput bufferOutput = new BufferOutput(result, slots);

		ResourceManager resourceManager = Activator.createResourceEngine(mapModeStrategy, dynamicTemplates);
		xpandFacade = new XpandFacade(ContextFactory.createXpandContext(resourceManager, bufferOutput, globals, getClass().getClassLoader()));
	}

	public String go(Figure figure, ImportAssistant importAssistant) {
		result.setLength(0);
		additionalMethods.setLength(0);
		additionalFields.setLength(0);
		StringBuffer ss = new StringBuffer();
		importAssistant.emitPackageStatement(ss);
		packageStatement.setValue(ss.toString());
		xpandFacade.evaluate("top::Figure::FigureClass", figure, new Object[] {myIsInnerClassCode});
		final String resultString = result.toString();
		return resultString;
	}

	public String generate(IProgressMonitor monitor, Object[] arguments) throws InterruptedException, InvocationTargetException, UnexpectedBehaviourException {
		if (arguments == null || arguments.length != 2 || false == arguments[0] instanceof Figure || false == arguments[1] instanceof ImportAssistant) {
			throw new UnexpectedBehaviourException("(Figure, ImportAssistant) expected as arguments, not " + arguments);
		}
		return go((Figure) arguments[0], (ImportAssistant) arguments[1]);
	}
}
