/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.migration;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModelExt;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.eclipse.ocl.types.AnyType;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.OrderedSetType;
import org.eclipse.ocl.types.PrimitiveType;
import org.eclipse.ocl.types.SequenceType;
import org.eclipse.ocl.types.SetType;
import org.eclipse.ocl.types.VoidType;

public class TypeManager {

	private final ModeltypeImports modeltypeImportsManger;
	
	private boolean useFQNameForPrimitiveTypes = false;

	private OclKeywordManager oclKeywordManager;

	public TypeManager(OclKeywordManager keywordManager) {
		this(null, keywordManager);
	}
	
	public TypeManager(ModeltypeImports modelImports, OclKeywordManager keywordManager) {
		modeltypeImportsManger = modelImports;
		oclKeywordManager = keywordManager;
	}
	
	public void setUseFQNameForPrimitiveTypes(boolean value) {
		useFQNameForPrimitiveTypes = value;
	}

	public String getQvtFQName(EEnumLiteral literal) {
		return getPackageName(literal.getEEnum().getEPackage()) + OclCs.PATH_SEPARATOR + oclKeywordManager.getValidIdentifierValue(literal.getEEnum().getName()) + OclCs.PATH_SEPARATOR
				+ oclKeywordManager.getValidIdentifierValue(literal.getName());
	}
	
	public String getQvtFQName(EClassifier classifier) throws MigrationException {
		if (classifier == BuiltinMetaModel.VOID) {
			return VoidType.SINGLETON_NAME;
		}
		if (classifier instanceof EDataType) {
			/**
			 * Handling QVT primitive types here.
			 */
			if (EcorePackage.eINSTANCE.getEString() == classifier) {
				return getPrimitiveTypeName(PrimitiveType.STRING_NAME, useFQNameForPrimitiveTypes);
			} else if (EcorePackage.eINSTANCE.getEBoolean() == classifier) {
				return getPrimitiveTypeName(PrimitiveType.BOOLEAN_NAME, useFQNameForPrimitiveTypes);
			} else if (EcorePackage.eINSTANCE.getEInt() == classifier) {
				return getPrimitiveTypeName(PrimitiveType.INTEGER_NAME, useFQNameForPrimitiveTypes);
			} else if (EcorePackage.eINSTANCE.getEDouble() == classifier) {
				return getPrimitiveTypeName(PrimitiveType.REAL_NAME, useFQNameForPrimitiveTypes);
			} else if (EcorePackage.eINSTANCE.getEJavaObject() == classifier) {
				return getPrimitiveTypeName(AnyType.SINGLETON_NAME, useFQNameForPrimitiveTypes);
			}
		}
		if (BuiltinMetaModel.isCollectionType(classifier)) {
			StringBuilder sb = new StringBuilder();
			if (BuiltinMetaModelExt.isSetType(classifier)) {
				sb.append(SetType.SINGLETON_NAME);
			} else if (BuiltinMetaModelExt.isListType(classifier)) {
				sb.append(SequenceType.SINGLETON_NAME);
			} else if (BuiltinMetaModelExt.isOrderedSetType(classifier)) { 
				sb.append(OrderedSetType.SINGLETON_NAME);
			} else {
				sb.append(CollectionType.SINGLETON_NAME);
			}
			sb.append(OclCs.OPEN_PAREN);
			sb.append(getQvtFQName(BuiltinMetaModel.getInnerType(classifier)));
			return sb.append(OclCs.CLOSE_PAREN).toString();
		}
		EPackage ePackage = classifier.getEPackage();
		assert ePackage != null;
		return getPackageName(ePackage) + OclCs.PATH_SEPARATOR + oclKeywordManager.getValidIdentifierValue(classifier.getName());
	}

	private String getPrimitiveTypeName(String primitiveTypeName, boolean useFQNameForPrimitiveTypes) {
		return useFQNameForPrimitiveTypes ? OCLStandardLibraryImpl.stdlibPackage.getName() + OclCs.PATH_SEPARATOR + primitiveTypeName : primitiveTypeName;
	}

	private String getPackageName(EPackage ePackage) {
		return modeltypeImportsManger != null ? modeltypeImportsManger.getModeltypeAlias(ePackage) : oclKeywordManager.getValidIdentifierValue(ePackage.getName());
	}

}
