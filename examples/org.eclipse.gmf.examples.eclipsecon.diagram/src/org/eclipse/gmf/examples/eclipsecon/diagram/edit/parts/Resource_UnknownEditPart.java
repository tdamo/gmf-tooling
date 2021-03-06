package org.eclipse.gmf.examples.eclipsecon.diagram.edit.parts;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPolicy;
//import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
//import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.examples.eclipsecon.diagram.edit.policies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.transaction.RunnableWithResult;

import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.requests.DirectEditRequest;

import org.eclipse.gef.tools.DirectEditManager;

import org.eclipse.gmf.examples.eclipsecon.diagram.providers.EclipseconElementTypes;
import org.eclipse.gmf.examples.eclipsecon.diagram.providers.EclipseconSemanticHints;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;

import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;

import org.eclipse.gmf.runtime.gef.ui.internal.requests.DirectEditRequestWrapper;

import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;

import org.eclipse.jface.text.contentassist.IContentAssistProcessor;

import org.eclipse.jface.viewers.ICellEditorValidator;

import org.eclipse.swt.SWT;

import org.eclipse.swt.accessibility.AccessibleEvent;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Resource_UnknownEditPart extends
		EclipseconExternalNodeLabelEditPart implements ITextAwareEditPart {

	/**
	 * @generated
	 */
	private DirectEditManager manager;

	/**
	 * @generated
	 */
	private IParser parser;

	/**
	 * @generated
	 */
	private List parserElements;

	/**
	 * @generated
	 */
	private String defaultText;

	/**
	 * @generated
	 */
	static {
		registerSnapBackPosition(
				EclipseconSemanticHints.Resource_1004Labels.RESOURCEUNKNOWN_4006,
				new Point(0, 0));
	}

	/**
	 * @generated
	 */
	public Resource_UnknownEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,
				new LabelDirectEditPolicy());
	}

	/**
	 * @generated
	 */
	protected IFigure createFigure() {
		Label figure = new Label();
		defaultText = figure.getText();
		return figure;
	}

	/**
	 * @generated
	 */
	public Label getLabel() {
		return (Label) getFigure();
	}

	/**
	 * @generated
	 */
	public void setLabel(Label figure) {
		unregisterVisuals();
		setFigure(figure);
		defaultText = figure.getText();
		registerVisuals();
		refreshVisuals();
	}

	/**
	 * @generated
	 */
	protected void refreshUnderline() {
		FontStyle style = (FontStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			//getLabel().setTextUnderline(style.isUnderline());
		}
	}

	/**
	 * @generated
	 */
	protected void refreshStrikeThrough() {
		FontStyle style = (FontStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		if (style != null) {
			//getLabel().setTextStrikeThrough(style.isStrikeThrough());
		}
	}

	/**
	 * @generated
	 */
	protected Image getLabelIcon() {
		return null;
	}

	/**
	 * @generated
	 */
	protected List getModelChildren() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public IGraphicalEditPart getChildBySemanticHint(String semanticHint) {
		return null;
	}

	/**
	 * @generated
	 */
	protected String getLabelText() {
		EObject element = resolveSemanticElement();
		String text = null;
		if (element != null && getParser() != null) {
			text = getParser().getPrintString(new EObjectAdapter(element),
					getParserOptions().intValue());
		}
		if (text == null || text.length() == 0) {
			text = defaultText;
		}
		return text;
	}

	/**
	 * @generated
	 */
	public String getEditText() {
		EObject element = resolveSemanticElement();
		if (element == null || getParser() == null) {
			return "";
		}
		return getParser().getEditString(new EObjectAdapter(element),
				getParserOptions().intValue());
	}

	/**
	 * @generated
	 */
	protected boolean isEditable() {
		return false;
	}

	/**
	 * @generated
	 */
	public ICellEditorValidator getEditTextValidator() {
		return new ICellEditorValidator() {

			public String isValid(final Object value) {
				if (value instanceof String) {
					final EObject element = resolveSemanticElement();
					final IParser parser = getParser();
					try {
						IParserEditStatus valid = (IParserEditStatus) getEditingDomain()
								.runExclusive(new RunnableWithResult.Impl() {

									public void run() {
										setResult(parser.isValidEditString(
												new EObjectAdapter(element),
												(String) value));
									}
								});
						return valid.getCode() == ParserEditStatus.EDITABLE ? null
								: valid.getMessage();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}

				// shouldn't get here
				return null;
			}
		};
	}

	/**
	 * @generated
	 */
	public IContentAssistProcessor getCompletionProcessor() {
		EObject element = resolveSemanticElement();
		if (element == null || getParser() == null) {
			return null;
		}
		return getParser().getCompletionProcessor(new EObjectAdapter(element));
	}

	/**
	 * @generated
	 */
	public ParserOptions getParserOptions() {
		return ParserOptions.NONE;
	}

	/**
	 * @generated
	 */
	public IParser getParser() {
		if (parser == null) {
			String parserHint = ((View) getModel()).getType();
			EObject element = resolveSemanticElement();
			if (element != null) {
				ParserHintAdapter hintAdapter = new ParserHintAdapter(element,
						parserHint) {

					public Object getAdapter(Class adapter) {
						if (IElementType.class.equals(adapter)) {
							return EclipseconElementTypes.Resource_1004;
						}
						return super.getAdapter(adapter);
					}
				};
				parser = ParserService.getInstance().getParser(hintAdapter);
			}
		}
		return parser;
	}

	/**
	 * @generated
	 */
	protected DirectEditManager getManager() {
		if (manager == null) {
			setManager(new TextDirectEditManager(this));
		}
		return manager;
	}

	/**
	 * @generated
	 */
	protected void setManager(DirectEditManager manager) {
		this.manager = manager;
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit() {
		getManager().show();
	}

	/**
	 * @generated
	 */
	protected void performDirectEdit(Point eventLocation) {
		if (getManager().getClass() == TextDirectEditManager.class) {
			((TextDirectEditManager) getManager()).show(eventLocation
					.getSWTPoint());
		}
	}

	/**
	 * @generated
	 */
	private void performDirectEdit(char initialCharacter) {
		if (getManager() instanceof TextDirectEditManager) {
			((TextDirectEditManager) getManager()).show(initialCharacter);
		} else {
			performDirectEdit();
		}
	}

	/**
	 * @generated
	 */
	protected void performDirectEditRequest(Request request) {
		final Request theRequest = request;
		try {
			getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					if (isActive() && isEditable()) {
						if (theRequest instanceof DirectEditRequestWrapper) {
							char c = ((DirectEditRequestWrapper) theRequest)
									.getInitialCharacter();
							performDirectEdit(c);
						} else if ((theRequest instanceof DirectEditRequest)
								&& (getEditText().equals(getLabelText()))) {
							DirectEditRequest editRequest = (DirectEditRequest) theRequest;
							performDirectEdit(editRequest.getLocation());
						} else {
							performDirectEdit();
						}
					}
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @generated
	 */
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshLabel();
		refreshFont();
		refreshFontColor();
		refreshUnderline();
		refreshStrikeThrough();
	}

	/**
	 * @generated
	 */
	protected void refreshLabel() {
		getLabel().setText(getLabelText());
		getLabel().setIcon(getLabelIcon());
	}

	/**
	 * @generated
	 */
	protected void refreshFont() {
		FontStyle style = (FontStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFontStyle());
		FontData fontData;
		if (style != null) {
			fontData = new FontData(style.getFontName(), style.getFontHeight(),
					(style.isBold() ? SWT.BOLD : SWT.NORMAL)
							| (style.isItalic() ? SWT.ITALIC : SWT.NORMAL));
		} else {
			// initialize font to defaults
			fontData = PreferenceConverter.getFontData(
					(IPreferenceStore) getDiagramPreferencesHint()
							.getPreferenceStore(),
					IPreferenceConstants.PREF_DEFAULT_FONT);
		}
		setFont(fontData);
	}

	/**
	 * @generated
	 */
	protected void setFontColor(Color color) {
		getLabel().setForegroundColor(color);
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		if (getParser() instanceof ISemanticParser) {
			EObject element = resolveSemanticElement();
			parserElements = ((ISemanticParser) getParser())
					.getSemanticElementsBeingParsed(element);
			for (int i = 0; i < parserElements.size(); i++) {
				addListenerFilter(
						"SemanticModel" + i, this, (EObject) parserElements.get(i)); //$NON-NLS-1$
			}
		} else {
			super.addSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		if (parserElements != null) {
			for (int i = 0; i < parserElements.size(); i++) {
				removeListenerFilter("SemanticModel" + i); //$NON-NLS-1$
			}
		} else {
			super.removeSemanticListeners();
		}
	}

	/**
	 * @generated
	 */
	protected AccessibleEditPart getAccessibleEditPart() {
		if (accessibleEP == null) {
			accessibleEP = new AccessibleGraphicalEditPart() {

				public void getName(AccessibleEvent e) {
					e.result = getLabel().getText();
				}
			};
		}
		return accessibleEP;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		Object feature = event.getFeature();
		if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
			Integer c = (Integer) event.getNewValue();
			setFontColor(DiagramColorRegistry.getInstance().getColor(c));
		} else if (NotationPackage.eINSTANCE.getFontStyle_Underline().equals(
				feature)) {
			refreshUnderline();
		} else if (NotationPackage.eINSTANCE.getFontStyle_StrikeThrough()
				.equals(feature)) {
			refreshStrikeThrough();
		} else if (NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(
				feature)
				|| NotationPackage.eINSTANCE.getFontStyle_FontName().equals(
						feature)
				|| NotationPackage.eINSTANCE.getFontStyle_Bold()
						.equals(feature)
				|| NotationPackage.eINSTANCE.getFontStyle_Italic().equals(
						feature)) {
			refreshFont();
		} else {
			if (getParser() != null
					&& getParser().isAffectingEvent(event,
							getParserOptions().intValue())) {
				refreshLabel();
			}
			if (getParser() instanceof ISemanticParser) {
				ISemanticParser modelParser = (ISemanticParser) getParser();
				if (modelParser.areSemanticElementsAffected(null, event)) {
					removeSemanticListeners();
					if (resolveSemanticElement() != null) {
						addSemanticListeners();
					}
					refreshLabel();
				}
			}
		}
		super.handleNotificationEvent(event);
	}
}
