/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLinkReferenceOnly;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Link Reference Only</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GenLinkReferenceOnlyImpl extends GenLinkImpl implements GenLinkReferenceOnly {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLinkReferenceOnlyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenPackage.eINSTANCE.getGenLinkReferenceOnly();
	}

	protected String getDefaultNotationViewFactoryClassName() {
		EStructuralFeature cnt = getContainmentMetaFeature().getEcoreFeature();
		String className = cnt.getEContainingClass().getName();
		String featureName = cnt.getName();
		return className + '_' + featureName + "ViewFactory"; //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VIEWMAP:
					return basicSetViewmap(null, msgs);
				case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM:
					return eBasicSetContainer(null, GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM:
					return eContainer.eInverseRemove(this, GMFGenPackage.GEN_DIAGRAM__LINKS, GenDiagram.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM_RUN_TIME_CLASS:
				if (resolve) return getDiagramRunTimeClass();
				return basicGetDiagramRunTimeClass();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VISUAL_ID:
				return new Integer(getVisualID());
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__EDIT_PART_CLASS_NAME:
				return getEditPartClassName();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__META_INFO_PROVIDER_CLASS_NAME:
				return getMetaInfoProviderClassName();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_NAME_FEATURE:
				if (resolve) return getDomainNameFeature();
				return basicGetDomainNameFeature();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__FOREGROUND_COLOR:
				return getForegroundColor();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__CONTAINMENT_META_FEATURE:
				if (resolve) return getContainmentMetaFeature();
				return basicGetContainmentMetaFeature();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return getNotationViewFactoryClassName();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VIEWMAP:
				return getViewmap();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM:
				return getDiagram();
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_LINK_TARGET_FEATURE:
				if (resolve) return getDomainLinkTargetFeature();
				return basicGetDomainLinkTargetFeature();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VISUAL_ID:
				setVisualID(((Integer)newValue).intValue());
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__EDIT_PART_CLASS_NAME:
				setEditPartClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__FOREGROUND_COLOR:
				setForegroundColor((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName((String)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VIEWMAP:
				setViewmap((Viewmap)newValue);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_LINK_TARGET_FEATURE:
				setDomainLinkTargetFeature((GenFeature)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM_RUN_TIME_CLASS:
				setDiagramRunTimeClass((GenClass)null);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VISUAL_ID:
				setVisualID(VISUAL_ID_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__EDIT_PART_CLASS_NAME:
				setEditPartClassName(EDIT_PART_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__META_INFO_PROVIDER_CLASS_NAME:
				setMetaInfoProviderClassName(META_INFO_PROVIDER_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_NAME_FEATURE:
				setDomainNameFeature((GenFeature)null);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__FOREGROUND_COLOR:
				setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__CONTAINMENT_META_FEATURE:
				setContainmentMetaFeature((GenFeature)null);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__NOTATION_VIEW_FACTORY_CLASS_NAME:
				setNotationViewFactoryClassName(NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VIEWMAP:
				setViewmap((Viewmap)null);
				return;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_LINK_TARGET_FEATURE:
				setDomainLinkTargetFeature((GenFeature)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM_RUN_TIME_CLASS:
				return diagramRunTimeClass != null;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VISUAL_ID:
				return visualID != VISUAL_ID_EDEFAULT;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__EDIT_PART_CLASS_NAME:
				return EDIT_PART_CLASS_NAME_EDEFAULT == null ? editPartClassName != null : !EDIT_PART_CLASS_NAME_EDEFAULT.equals(editPartClassName);
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__META_INFO_PROVIDER_CLASS_NAME:
				return META_INFO_PROVIDER_CLASS_NAME_EDEFAULT == null ? metaInfoProviderClassName != null : !META_INFO_PROVIDER_CLASS_NAME_EDEFAULT.equals(metaInfoProviderClassName);
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_NAME_FEATURE:
				return domainNameFeature != null;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__FOREGROUND_COLOR:
				return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null : !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__CONTAINMENT_META_FEATURE:
				return containmentMetaFeature != null;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__NOTATION_VIEW_FACTORY_CLASS_NAME:
				return NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT == null ? notationViewFactoryClassName != null : !NOTATION_VIEW_FACTORY_CLASS_NAME_EDEFAULT.equals(notationViewFactoryClassName);
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__VIEWMAP:
				return viewmap != null;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DIAGRAM:
				return getDiagram() != null;
			case GMFGenPackage.GEN_LINK_REFERENCE_ONLY__DOMAIN_LINK_TARGET_FEATURE:
				return domainLinkTargetFeature != null;
		}
		return eDynamicIsSet(eFeature);
	}

	public String getClassNamePrefix() {
		return getDomainLinkTargetFeature() == null ? "GenPseudoLink$" + hashCode() : getDomainLinkTargetFeature().getEcoreFeature().getEType().getName();
	}

	public String getClassNameSuffux() {
		return "PseudoLink";
	}
} //GenLinkReferenceOnlyImpl
