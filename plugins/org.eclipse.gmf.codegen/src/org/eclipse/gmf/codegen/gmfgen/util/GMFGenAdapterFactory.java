/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap;
import org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.EntryBase;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.codegen.gmfgen.GenBaseElement;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkReferenceOnly;
import org.eclipse.gmf.codegen.gmfgen.GenLinkWithClass;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.LinkDecoration;
import org.eclipse.gmf.codegen.gmfgen.LinkEntry;
import org.eclipse.gmf.codegen.gmfgen.NodeEntry;
import org.eclipse.gmf.codegen.gmfgen.Palette;
import org.eclipse.gmf.codegen.gmfgen.ShapeAttributes;
import org.eclipse.gmf.codegen.gmfgen.ToolEntry;
import org.eclipse.gmf.codegen.gmfgen.ToolGroup;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage
 * @generated
 */
public class GMFGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GMFGenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMFGenSwitch modelSwitch =
		new GMFGenSwitch() {
			public Object caseGenDiagram(GenDiagram object) {
				return createGenDiagramAdapter();
			}
			public Object caseGenCommonBase(GenCommonBase object) {
				return createGenCommonBaseAdapter();
			}
			public Object caseGenBaseElement(GenBaseElement object) {
				return createGenBaseElementAdapter();
			}
			public Object caseGenNode(GenNode object) {
				return createGenNodeAdapter();
			}
			public Object caseGenChildNode(GenChildNode object) {
				return createGenChildNodeAdapter();
			}
			public Object caseGenChildContainer(GenChildContainer object) {
				return createGenChildContainerAdapter();
			}
			public Object caseGenLink(GenLink object) {
				return createGenLinkAdapter();
			}
			public Object caseGenLinkWithClass(GenLinkWithClass object) {
				return createGenLinkWithClassAdapter();
			}
			public Object caseGenLinkReferenceOnly(GenLinkReferenceOnly object) {
				return createGenLinkReferenceOnlyAdapter();
			}
			public Object caseViewmap(Viewmap object) {
				return createViewmapAdapter();
			}
			public Object caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			public Object caseShapeAttributes(ShapeAttributes object) {
				return createShapeAttributesAdapter();
			}
			public Object caseDefaultSizeAttributes(DefaultSizeAttributes object) {
				return createDefaultSizeAttributesAdapter();
			}
			public Object caseFigureViewmap(FigureViewmap object) {
				return createFigureViewmapAdapter();
			}
			public Object caseBasicNodeViewmap(BasicNodeViewmap object) {
				return createBasicNodeViewmapAdapter();
			}
			public Object caseDecoratedConnectionViewmap(DecoratedConnectionViewmap object) {
				return createDecoratedConnectionViewmapAdapter();
			}
			public Object caseLinkDecoration(LinkDecoration object) {
				return createLinkDecorationAdapter();
			}
			public Object casePalette(Palette object) {
				return createPaletteAdapter();
			}
			public Object caseEntryBase(EntryBase object) {
				return createEntryBaseAdapter();
			}
			public Object caseToolEntry(ToolEntry object) {
				return createToolEntryAdapter();
			}
			public Object caseNodeEntry(NodeEntry object) {
				return createNodeEntryAdapter();
			}
			public Object caseLinkEntry(LinkEntry object) {
				return createLinkEntryAdapter();
			}
			public Object caseToolGroup(ToolGroup object) {
				return createToolGroupAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenDiagram <em>Gen Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenDiagram
	 * @generated
	 */
	public Adapter createGenDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase <em>Gen Common Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenCommonBase
	 * @generated
	 */
	public Adapter createGenCommonBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenBaseElement <em>Gen Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenBaseElement
	 * @generated
	 */
	public Adapter createGenBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenNode <em>Gen Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenNode
	 * @generated
	 */
	public Adapter createGenNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildNode <em>Gen Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildNode
	 * @generated
	 */
	public Adapter createGenChildNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenChildContainer <em>Gen Child Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenChildContainer
	 * @generated
	 */
	public Adapter createGenChildContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenLink <em>Gen Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLink
	 * @generated
	 */
	public Adapter createGenLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkWithClass <em>Gen Link With Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkWithClass
	 * @generated
	 */
	public Adapter createGenLinkWithClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.GenLinkReferenceOnly <em>Gen Link Reference Only</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.GenLinkReferenceOnly
	 * @generated
	 */
	public Adapter createGenLinkReferenceOnlyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.Viewmap <em>Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.Viewmap
	 * @generated
	 */
	public Adapter createViewmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.ShapeAttributes <em>Shape Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.ShapeAttributes
	 * @generated
	 */
	public Adapter createShapeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes <em>Default Size Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes
	 * @generated
	 */
	public Adapter createDefaultSizeAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.FigureViewmap <em>Figure Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.FigureViewmap
	 * @generated
	 */
	public Adapter createFigureViewmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap <em>Basic Node Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap
	 * @generated
	 */
	public Adapter createBasicNodeViewmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap <em>Decorated Connection Viewmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.DecoratedConnectionViewmap
	 * @generated
	 */
	public Adapter createDecoratedConnectionViewmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.LinkDecoration <em>Link Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkDecoration
	 * @generated
	 */
	public Adapter createLinkDecorationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.Palette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.Palette
	 * @generated
	 */
	public Adapter createPaletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.EntryBase <em>Entry Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.EntryBase
	 * @generated
	 */
	public Adapter createEntryBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.ToolEntry <em>Tool Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolEntry
	 * @generated
	 */
	public Adapter createToolEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.NodeEntry <em>Node Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.NodeEntry
	 * @generated
	 */
	public Adapter createNodeEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.LinkEntry <em>Link Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.LinkEntry
	 * @generated
	 */
	public Adapter createLinkEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.ToolGroup <em>Tool Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.ToolGroup
	 * @generated
	 */
	public Adapter createToolGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GMFGenAdapterFactory
