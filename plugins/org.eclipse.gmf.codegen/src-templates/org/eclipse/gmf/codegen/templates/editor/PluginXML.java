package org.eclipse.gmf.codegen.templates.editor;

import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class PluginXML
{
  protected static String nl;
  public static synchronized PluginXML create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginXML result = new PluginXML();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<?eclipse version=\"3.0\"?>" + NL + "<plugin>" + NL + "" + NL + "   <extension point=\"org.eclipse.core.runtime.preferences\">" + NL + "      <initializer class=\"";
  protected final String TEXT_2 = "\"/>" + NL + "   </extension>" + NL + "" + NL + "  <extension point=\"org.eclipse.team.core.fileTypes\">" + NL + "      <fileTypes" + NL + "         type=\"text\"" + NL + "         extension=\"";
  protected final String TEXT_3 = "\">" + NL + "      </fileTypes>" + NL + "  </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.emf.ecore.extension_parser\">" + NL + "      <parser" + NL + "         type=\"";
  protected final String TEXT_4 = "\"" + NL + "         class=\"org.eclipse.gmf.runtime.emf.core.resources.MResourceFactory\">" + NL + "      </parser>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.ui.editors\">" + NL + "     <editor" + NL + "        id=\"";
  protected final String TEXT_5 = "ID\"" + NL + "        name=\"";
  protected final String TEXT_6 = " Diagram Editor\"" + NL + "        icon=\"../";
  protected final String TEXT_7 = "/icons/full/obj16/";
  protected final String TEXT_8 = "ModelFile.gif\"" + NL + "        extensions=\"";
  protected final String TEXT_9 = "\"" + NL + "        default=\"true\"" + NL + "        class=\"";
  protected final String TEXT_10 = "\"" + NL + "        matchingStrategy=\"";
  protected final String TEXT_11 = "\"" + NL + "        contributorClass=\"";
  protected final String TEXT_12 = "\">" + NL + "     </editor>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.ui.newWizards\">" + NL + "  \t  <wizard" + NL + "  \t     name=\"";
  protected final String TEXT_13 = " Diagram\"" + NL + "  \t     icon=\"../";
  protected final String TEXT_14 = "/icons/full/obj16/";
  protected final String TEXT_15 = "ModelFile.gif\"" + NL + "  \t     category=\"org.eclipse.ui.Examples\"" + NL + "  \t     class=\"";
  protected final String TEXT_16 = "\"" + NL + "  \t     id=\"";
  protected final String TEXT_17 = "ID\">" + NL + "  \t  \t <description>" + NL + "  \t  \t\tCreates ";
  protected final String TEXT_18 = " diagram." + NL + "  \t  \t </description>  " + NL + "      </wizard>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.ui.popupMenus\">" + NL + "      <objectContribution" + NL + "            id=\"";
  protected final String TEXT_19 = ".ui.objectContribution.IFile1\"" + NL + "            nameFilter=\"*.";
  protected final String TEXT_20 = "\"" + NL + "            objectClass=\"org.eclipse.core.resources.IFile\">" + NL + "         <action" + NL + "               label=\"Initialize ";
  protected final String TEXT_21 = " diagram file\"" + NL + "               class=\"";
  protected final String TEXT_22 = "\"" + NL + "               menubarPath=\"additions\"" + NL + "               enablesFor=\"1\"" + NL + "               id=\"";
  protected final String TEXT_23 = "ID\">" + NL + "         </action>" + NL + "      </objectContribution>  ";
  protected final String TEXT_24 = NL + "      <objectContribution" + NL + "            adaptable=\"false\"" + NL + "            id=\"";
  protected final String TEXT_25 = ".ui.objectContribution.FileEditorInputProxy1\"" + NL + "            objectClass=\"";
  protected final String TEXT_26 = "\">" + NL + "         <action" + NL + "               class=\"";
  protected final String TEXT_27 = "\"" + NL + "               enablesFor=\"1\"" + NL + "               id=\"";
  protected final String TEXT_28 = "ID\"" + NL + "               label=\"Create Shortcut\"" + NL + "               menubarPath=\"additions\">" + NL + "         </action>" + NL + "      </objectContribution>                      ";
  protected final String TEXT_29 = NL + "  </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.common.ui.services.action.globalActionHandlerProviders\">" + NL + "      <GlobalActionHandlerProvider" + NL + "         class=\"org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandlerProvider\"" + NL + "         id=\"";
  protected final String TEXT_30 = "Presentation\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <ViewId id=\"";
  protected final String TEXT_31 = "ID\">" + NL + "            <ElementType class=\"org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart\">" + NL + "               <GlobalActionId actionId=\"delete\"/>" + NL + "            </ElementType>" + NL + "            <ElementType class=\"org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart\">" + NL + "               <GlobalActionId actionId=\"save\"/>" + NL + "            </ElementType>" + NL + "         </ViewId>" + NL + "      </GlobalActionHandlerProvider>";
  protected final String TEXT_32 = NL + "      <GlobalActionHandlerProvider" + NL + "         class=\"org.eclipse.gmf.runtime.diagram.ui.printing.render.providers.DiagramWithPrintGlobalActionHandlerProvider\"" + NL + "         id=\"";
  protected final String TEXT_33 = "PresentationPrint\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <ViewId id=\"";
  protected final String TEXT_34 = "ID\">" + NL + "            <ElementType class=\"org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart\">" + NL + "               <GlobalActionId actionId=\"print\"/>" + NL + "            </ElementType>" + NL + "         </ViewId>" + NL + "      </GlobalActionHandlerProvider>";
  protected final String TEXT_35 = NL + "      <GlobalActionHandlerProvider" + NL + "         class=\"org.eclipse.gmf.runtime.diagram.ui.providers.ide.providers.DiagramIDEGlobalActionHandlerProvider\"" + NL + "         id=\"";
  protected final String TEXT_36 = "PresentationIDE\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <ViewId id=\"";
  protected final String TEXT_37 = "ID\">" + NL + "            <ElementType class=\"org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart\">" + NL + "               <GlobalActionId actionId=\"bookmark\"/>" + NL + "            </ElementType>" + NL + "         </ViewId>" + NL + "      </GlobalActionHandlerProvider>" + NL + "      <GlobalActionHandlerProvider" + NL + "            class=\"org.eclipse.gmf.runtime.diagram.ui.render.providers.DiagramUIRenderGlobalActionHandlerProvider\"" + NL + "            id=\"";
  protected final String TEXT_38 = "Render\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <ViewId id=\"";
  protected final String TEXT_39 = "ID\">" + NL + "            <ElementType class=\"org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart\">" + NL + "               <GlobalActionId actionId=\"cut\"/>" + NL + "               <GlobalActionId actionId=\"copy\"/>" + NL + "               <GlobalActionId actionId=\"paste\"/>" + NL + "            </ElementType>" + NL + "         </ViewId>" + NL + "      </GlobalActionHandlerProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.diagram.core.viewProviders\">" + NL + "      <viewProvider class=\"";
  protected final String TEXT_40 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <context viewClass=\"org.eclipse.gmf.runtime.notation.Diagram\" semanticHints=\"";
  protected final String TEXT_41 = "\"/>" + NL + "         <context viewClass=\"org.eclipse.gmf.runtime.notation.Node\" semanticHints=\"\"/>" + NL + "         <context viewClass=\"org.eclipse.gmf.runtime.notation.Edge\" semanticHints=\"\"/>" + NL + "      </viewProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.diagram.ui.editpartProviders\">" + NL + "      <editpartProvider class=\"";
  protected final String TEXT_42 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </editpartProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.emf.core.MetaModelProviders\">" + NL + "      <MetaModelProvider class=\"";
  protected final String TEXT_43 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </MetaModelProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.emf.ui.modelingAssistantProviders\">" + NL + "      <modelingAssistantProvider class=\"";
  protected final String TEXT_44 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </modelingAssistantProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.common.ui.services.properties.propertiesProviders\">" + NL + "      <PropertiesProvider" + NL + "            verifyPluginLoaded=\"false\"" + NL + "            class=\"";
  protected final String TEXT_45 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </PropertiesProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension point=\"org.eclipse.gmf.runtime.common.ui.services.iconProviders\">" + NL + "      <IconProvider class=\"";
  protected final String TEXT_46 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </IconProvider>" + NL + "   </extension>";
  protected final String TEXT_47 = NL + NL + "   <extension point=\"org.eclipse.gmf.runtime.common.ui.services.markerNavigationProviders\">" + NL + "      <MarkerNavigationProvider class=\"";
  protected final String TEXT_48 = "\">" + NL + "         <MarkerType name=\"";
  protected final String TEXT_49 = "\"/>" + NL + "         <Priority name=\"Medium\"/>" + NL + "      </MarkerNavigationProvider>" + NL + "   </extension>" + NL + "" + NL + "   <extension id=\"ValidationContributionItemProvider\" name=\"Validation\"" + NL + "      point=\"org.eclipse.gmf.runtime.common.ui.services.action.contributionItemProviders\">" + NL + "      <contributionItemProvider checkPluginLoaded=\"true\"" + NL + "         class=\"";
  protected final String TEXT_50 = "\">" + NL + "         <Priority name=\"Medium\"/>" + NL + "         <partContribution id=\"";
  protected final String TEXT_51 = "ID\">" + NL + "            <partMenuGroup menubarPath=\"/diagramMenu/\" id=\"validationGroup\"/>" + NL + "            <partAction id=\"validateAction\" menubarPath=\"/diagramMenu/validationGroup\"/>" + NL + "         </partContribution>" + NL + "      </contributionItemProvider>" + NL + "   </extension>" + NL + "   " + NL + "   <extension id=\"";
  protected final String TEXT_52 = "\" name=\"";
  protected final String TEXT_53 = " problems\" point=\"org.eclipse.core.resources.markers\">" + NL + "      <super type=\"org.eclipse.core.resources.problemmarker\"/>   " + NL + "      <super type=\"org.eclipse.gmf.runtime.common.ui.services.marker\"/>" + NL + "      <persistent value=\"true\"/>      " + NL + "   </extension>";
  protected final String TEXT_54 = NL + "   ";
  protected final String TEXT_55 = NL + "<extension point=\"org.eclipse.emf.validation.constraintProviders\">";
  protected final String TEXT_56 = NL + "\t<category" + NL + "\t\tid=\"";
  protected final String TEXT_57 = "\"" + NL + "\t\tmandatory=\"false\"" + NL + "\t\tname=\"";
  protected final String TEXT_58 = "\">" + NL + "\t<![CDATA[";
  protected final String TEXT_59 = "]]>" + NL + "\t</category>\t\t";
  protected final String TEXT_60 = NL + "\t<constraintProvider cache=\"true\">" + NL + "\t\t<package namespaceUri=\"";
  protected final String TEXT_61 = "\"/>";
  protected final String TEXT_62 = NL + "\t\t<constraints categories=\"";
  protected final String TEXT_63 = "\">" + NL + "\t\t\t<constraint id=\"";
  protected final String TEXT_64 = "\"" + NL + "\t\t\t\tlang=\"OCL\" ";
  protected final String TEXT_65 = NL + "\t\t\t\tname=\"";
  protected final String TEXT_66 = "\"" + NL + "\t\t\t\tseverity=\"";
  protected final String TEXT_67 = "\" statusCode=\"";
  protected final String TEXT_68 = "\">" + NL + "\t\t\t\t<![CDATA[";
  protected final String TEXT_69 = "]]>" + NL + "\t            <description><![CDATA[";
  protected final String TEXT_70 = "]]></description>" + NL + "\t            <message><![CDATA[";
  protected final String TEXT_71 = "]]></message>" + NL + "\t\t\t\t<target class=\"";
  protected final String TEXT_72 = "\"/>\t\t\t\t" + NL + "\t\t\t</constraint>" + NL + "\t\t</constraints>";
  protected final String TEXT_73 = NL + "\t</constraintProvider>" + NL + "</extension>" + NL + "" + NL + "<extension point=\"org.eclipse.emf.validation.constraintBindings\">" + NL + "\t<clientContext default=\"true\" id=\"";
  protected final String TEXT_74 = ".clientContext\">" + NL + "\t\t<enablement/>" + NL + "\t</clientContext>" + NL + "\t<binding category=\"";
  protected final String TEXT_75 = "\"" + NL + "\t\tcontext=\"";
  protected final String TEXT_76 = ".clientContext\"/>" + NL + "</extension>";
  protected final String TEXT_77 = NL + "</plugin>";
  protected final String TEXT_78 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
final GenPlugin genPlugin = (GenPlugin) argument;
final GenDiagram genDiagram = genPlugin.getDiagram();
final GenModel genModel = genDiagram.getEMFGenModel();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(genDiagram.getPreferenceInitializerQualifiedClassName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genDiagram.getDiagramFileExtension());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genDiagram.getDiagramFileExtension());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getEditorPluginID());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genDiagram.getDomainMetaModel().getPrefix());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genDiagram.getDiagramFileExtension());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genDiagram.getMatchingStrategyQualifiedClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genDiagram.getActionBarContributorQualifiedClassName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getEditorPluginID());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genDiagram.getDomainMetaModel().getPrefix());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genDiagram.getCreationWizardQualifiedClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genDiagram.getCreationWizardQualifiedClassName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPlugin.getID());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genDiagram.getDomainDiagramElement().getGenPackage().getPrefix().toLowerCase());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genDiagram.getDiagramFileExtension());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genDiagram.getInitDiagramFileActionQualifiedClassName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genDiagram.getInitDiagramFileActionQualifiedClassName());
    stringBuffer.append(TEXT_23);
    if (genDiagram.generateCreateShortcutAction()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genPlugin.getID());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genDiagram.getEditPartQualifiedClassName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genDiagram.getCreateShortcutActionQualifiedClassName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genDiagram.getCreateShortcutActionQualifiedClassName());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_31);
    if (genPlugin.isPrintingEnabled()) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genDiagram.getNotationViewProviderQualifiedClassName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genDiagram.getEditPartProviderQualifiedClassName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genDiagram.getMetamodelSupportProviderQualifiedClassName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genDiagram.getModelingAssistantProviderQualifiedClassName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genDiagram.getPropertyProviderQualifiedClassName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genDiagram.getIconProviderQualifiedClassName());
    stringBuffer.append(TEXT_46);
    if(genDiagram.isValidationEnabled()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genDiagram.getMarkerNavigationProviderQualifiedClassName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genPlugin.getID() + "." + genDiagram.getValidationDiagnosticMarkerType());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genDiagram.getValidationProviderQualifiedClassName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genDiagram.getEditorQualifiedClassName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genDiagram.getValidationDiagnosticMarkerType());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genPlugin.getName());
    stringBuffer.append(TEXT_53);
    }
    stringBuffer.append(TEXT_54);
    
GenAuditContainer rootContainer = genDiagram.getAudits();
if(rootContainer != null) {
	java.util.List containers = rootContainer != null ? rootContainer.getAllAuditContainers() : java.util.Collections.EMPTY_LIST;

    stringBuffer.append(TEXT_55);
    
	java.util.HashMap idMap = new java.util.HashMap();
	for(int i = 0; i < containers.size(); i++) {
		GenAuditContainer container = (GenAuditContainer)containers.get(i);
		idMap.put(container, container.getId() != null ? container.getId() : "category" + Integer.toString(i + 1));
	}
	java.util.HashMap pathMap = new java.util.HashMap();
	for(int i = 0; i < containers.size(); i++) {
		GenAuditContainer category = (GenAuditContainer)containers.get(i);
		java.util.List path = category.getPath();
		StringBuffer id = new StringBuffer();
		for(int pathPos = 0; pathPos < path.size(); pathPos++) {
			if(pathPos > 0) id.append('/');
			id.append(idMap.get(path.get(pathPos)));
		}
		pathMap.put(category, id.toString());

    stringBuffer.append(TEXT_56);
    stringBuffer.append(id.toString());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(category.getName() != null ? category.getName() : id.toString());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(category.getDescription() != null ? category.getDescription():"");
    stringBuffer.append(TEXT_59);
    
	} // end of categories loop
	String rootCategoryId = (String)pathMap.get(rootContainer);

    stringBuffer.append(TEXT_60);
    stringBuffer.append(genDiagram.getDomainMetaModel().getNSURI());
    stringBuffer.append(TEXT_61);
    
	int rulePos = 0;
	for(java.util.Iterator catIt = containers.iterator(); catIt.hasNext(); rulePos++) {
		GenAuditContainer category = (GenAuditContainer)catIt.next();
		for(java.util.Iterator it = category.getAudits().iterator(); it.hasNext();) {
			GenAuditRule audit = (GenAuditRule)it.next();
			GenClass targetClass = audit.getTarget();
			String targetClassName = (targetClass != null) ? targetClass.getGenPackage().getNSName() + "." + targetClass.getInterfaceName() : "null";
			String modeAttr = audit.isUseInLiveMode() ? "" : "mode=\"Batch\"";
			String name = audit.getName() != null ? audit.getName() : audit.getId();
			String message = audit.getMessage() != null ? audit.getMessage() : name + " audit violated";

    stringBuffer.append(TEXT_62);
    stringBuffer.append(pathMap.get(category));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(audit.getId());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(modeAttr);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(audit.getSeverity().getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(Integer.toString(200 + rulePos));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(audit.getRule() != null ? audit.getRule().getBody() : "");
    stringBuffer.append(TEXT_69);
    stringBuffer.append(audit.getDescription() != null ? audit.getDescription():"");
    stringBuffer.append(TEXT_70);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(targetClassName);
    stringBuffer.append(TEXT_72);
    
		} // end of audits in category
	} // end of category loop

    stringBuffer.append(TEXT_73);
    stringBuffer.append(rootCategoryId);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(rootCategoryId);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(rootCategoryId);
    stringBuffer.append(TEXT_76);
    
	} 

    stringBuffer.append(TEXT_77);
    stringBuffer.append(TEXT_78);
    return stringBuffer.toString();
  }
}
