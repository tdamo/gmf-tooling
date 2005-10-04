package org.eclipse.gmf.codegen.templates.diacanvas;

import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import java.util.*;
import org.eclipse.gmf.codegen.util.ImportUtil;

public class InitDiagramFileActionGen
{
  protected static String nl;
  public static synchronized InitDiagramFileActionGen create(String lineSeparator)
  {
    nl = lineSeparator;
    InitDiagramFileActionGen result = new InitDiagramFileActionGen();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL + NL + "import java.io.IOException;" + NL + "import java.util.LinkedList;" + NL + "import java.util.Collection;" + NL + "import java.util.Collections;" + NL + "import java.util.HashMap;" + NL + "import java.util.Iterator;" + NL + "import java.util.Map;" + NL + "" + NL + "import org.eclipse.core.resources.IFile;" + NL + "import org.eclipse.core.resources.IResource;" + NL + "import org.eclipse.core.resources.ResourcesPlugin;" + NL + "import org.eclipse.core.runtime.IStatus;" + NL + "import org.eclipse.core.runtime.Path;" + NL + "import org.eclipse.emf.common.util.URI;" + NL + "import org.eclipse.emf.ecore.EClass;" + NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import org.eclipse.emf.ecore.EStructuralFeature;" + NL + "import org.eclipse.emf.ecore.resource.Resource;" + NL + "import org.eclipse.emf.ecore.resource.ResourceSet;" + NL + "import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;" + NL + "import org.eclipse.jface.action.IAction;" + NL + "import org.eclipse.jface.dialogs.IInputValidator;" + NL + "import org.eclipse.jface.dialogs.InputDialog;" + NL + "import org.eclipse.jface.dialogs.MessageDialog;" + NL + "import org.eclipse.jface.viewers.ISelection;" + NL + "import org.eclipse.jface.viewers.IStructuredSelection;" + NL + "import org.eclipse.swt.widgets.Shell;" + NL + "import org.eclipse.ui.IObjectActionDelegate;" + NL + "import org.eclipse.ui.IWorkbenchPart;" + NL + "import org.eclipse.ui.PartInitException;" + NL + "import org.eclipse.ui.ide.IDE;" + NL + "" + NL + "import org.eclipse.gmf.diagramrt.ChildNode;" + NL + "import org.eclipse.gmf.diagramrt.DiagramCanvas;" + NL + "import org.eclipse.gmf.diagramrt.DiagramLink;" + NL + "import org.eclipse.gmf.diagramrt.DiagramNode;" + NL;
  protected final String TEXT_4 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_5 = " implements IObjectActionDelegate, IInputValidator {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "    private static final String FILE_EXT = \"";
  protected final String TEXT_6 = "\";" + NL + "    " + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate IWorkbenchPart myPart;" + NL + "    " + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ResourceSet myResSet;" + NL + "    " + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate IFile mySelection;" + NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate Map myObject2NodeMap = new HashMap();" + NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate Map myLinkFactory2SourceNodeMap = new HashMap();" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tpublic void setActivePart(IAction action, IWorkbenchPart targetPart) {" + NL + "\t\tmyPart = targetPart;" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tpublic void run(IAction action) {" + NL + "\t\tInputDialog outputFileNameDialog = new InputDialog(getShell(), \"Diagram file name\", \"Please provide diagram file name\", mySelection.getProjectRelativePath().removeFileExtension().addFileExtension(FILE_EXT)" + NL + "\t\t\t\t.lastSegment(), this);" + NL + "\t\tif (outputFileNameDialog.open() != InputDialog.OK) {" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tmyResSet = new ResourceSetImpl();" + NL + "\t\tEObject diagramModelObject = load();" + NL + "\t\tif (diagramModelObject == null) {" + NL + "\t\t\tMessageDialog.openError(getShell(), \"Error\", \"Failed to load user model\");" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tEObject diagram = create(diagramModelObject);" + NL + "\t\tif (diagram == null) {" + NL + "\t\t\tMessageDialog.openError(getShell(), \"Error\", \"Failed to create diagram object\");" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tIFile destFile = mySelection.getParent().getFile(new Path(outputFileNameDialog.getValue()));" + NL + "\t\tString filePath = mySelection.getFullPath().removeLastSegments(1).append(outputFileNameDialog.getValue()).toString();" + NL + "\t\tsave(filePath, diagram);" + NL + "\t\ttry {" + NL + "\t\t\tIDE.openEditor(myPart.getSite().getPage(), destFile);" + NL + "\t\t} catch (PartInitException ex) {" + NL + "\t\t\tex.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate EObject create(EObject diagramModel) {" + NL + "\t\tmyObject2NodeMap.clear();" + NL + "\t\tmyLinkFactory2SourceNodeMap.clear();";
  protected final String TEXT_7 = NL + "\t\tDiagramCanvas diagramCanvas = ";
  protected final String TEXT_8 = ".eINSTANCE.create";
  protected final String TEXT_9 = "();" + NL + "\t\tdiagramCanvas.setDomainContainerObject(diagramModel);" + NL + "\t\t";
  protected final String TEXT_10 = NL + "\t\tmyLinkFactory2SourceNodeMap.put(new LinkFactoryImpl";
  protected final String TEXT_11 = "(), new LinkedList());";
  protected final String TEXT_12 = NL + "\t\t" + NL + "\t\tfor (Iterator it = diagramModel.eContents().iterator(); it.hasNext();) {" + NL + "\t\t\tEObject next = (EObject) it.next();" + NL + "\t\t\tEClass nextEClass = next.eClass();";
  protected final String TEXT_13 = NL + "            if (";
  protected final String TEXT_14 = ".eINSTANCE.get";
  protected final String TEXT_15 = "().equals(nextEClass)) {" + NL + "            \tgenerateNode";
  protected final String TEXT_16 = "(next, diagramCanvas);" + NL + "            } else ";
  protected final String TEXT_17 = NL + "\t\t\t{" + NL + "\t\t\t\tgenerateUnrecognizedNode(next, diagramCanvas);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tfor (Iterator it = myLinkFactory2SourceNodeMap.entrySet().iterator(); it.hasNext();) {" + NL + "\t\t\tMap.Entry entry = (Map.Entry) it.next();" + NL + "\t\t\tLinkFactory nextLinkFactory = (LinkFactory) entry.getKey();" + NL + "\t\t\tfor (Iterator nodes = ((Collection) entry.getValue()).iterator(); nodes.hasNext();) {" + NL + "\t\t\t\tnextLinkFactory.createLinks((DiagramNode) nodes.next(), diagramCanvas);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t" + NL + "\t    return diagramCanvas;" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate void generateUnrecognizedNode(EObject modelElement, DiagramCanvas diagramCanvas) {" + NL + "\t\t// Handle special cases here" + NL + "\t}" + NL + "\t";
  protected final String TEXT_18 = NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate void generateNode";
  protected final String TEXT_19 = "(EObject modelElement, DiagramCanvas diagramCanvas) {" + NL + "\t\tDiagramNode diagramNode = ";
  protected final String TEXT_20 = ".eINSTANCE.create";
  protected final String TEXT_21 = "();" + NL + "\t\tdiagramNode.setDomainModelElement(modelElement);" + NL + "\t\tstoreDiagramNode(diagramNode);" + NL + "\t\tdiagramNode.setUin(diagramCanvas.nextAvailableUin());" + NL + "\t\tdiagramNode.setVisualID(";
  protected final String TEXT_22 = ".VISUAL_ID);" + NL + "\t\tdiagramCanvas.getNodes().add(diagramNode);" + NL + "\t\t" + NL + "\t\tfor (Iterator it = modelElement.eContents().iterator(); it.hasNext();) {" + NL + "\t\t\tEObject next = (EObject) it.next();" + NL + "\t\t\tEClass nextEClass = next.eClass();";
  protected final String TEXT_23 = NL + "            if (";
  protected final String TEXT_24 = ".eINSTANCE.get";
  protected final String TEXT_25 = "().equals(nextEClass)) {" + NL + "\t\t\t\tChildNode nextChildNode = ";
  protected final String TEXT_26 = ".eINSTANCE.create";
  protected final String TEXT_27 = "();" + NL + "\t\t\t\tnextChildNode.setGroupID(\"";
  protected final String TEXT_28 = "\");" + NL + "\t\t\t\tnextChildNode.setDomainModelElement(next);" + NL + "\t\t\t\tstoreDiagramNode(nextChildNode);" + NL + "\t\t\t\tnextChildNode.setUin(diagramCanvas.nextAvailableUin());" + NL + "\t\t\t\tnextChildNode.setVisualID(";
  protected final String TEXT_29 = ".VISUAL_ID);" + NL + "\t\t\t\tdiagramNode.getChildNodes().add(nextChildNode);" + NL + "            } else ";
  protected final String TEXT_30 = NL + "\t\t\t{" + NL + "\t\t\t\tgenerateUnrecognizedSubNode";
  protected final String TEXT_31 = "(next, diagramNode, diagramCanvas);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate void generateUnrecognizedSubNode";
  protected final String TEXT_32 = "(EObject modelElement, DiagramNode diagramNode, DiagramCanvas diagramCanvas) {" + NL + "\t\t// Handle special cases here for subnodes of the node with Visual_ID = ";
  protected final String TEXT_33 = NL + "\t}";
  protected final String TEXT_34 = NL + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate void storeDiagramNode(DiagramNode diagramNode) {" + NL + "\t\tmyObject2NodeMap.put(diagramNode.getDomainModelElement(), diagramNode);" + NL + "\t\tfor (Iterator it = myLinkFactory2SourceNodeMap.entrySet().iterator(); it.hasNext();) {" + NL + "\t\t\tMap.Entry entry = (Map.Entry) it.next();" + NL + "\t\t\tLinkFactory nextLinkFactory = (LinkFactory) entry.getKey();" + NL + "\t\t\tCollection nodes = (Collection) entry.getValue();" + NL + "\t\t\tif (nextLinkFactory.isApplicable(diagramNode)) {" + NL + "\t\t\t\tnodes.add(diagramNode);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate DiagramNode getDiagramNode(EObject modelElement) {" + NL + "\t\treturn (DiagramNode) myObject2NodeMap.get(modelElement);" + NL + "\t}" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate EObject load() {" + NL + "\t\tResource resource = myResSet.getResource(URI.createPlatformResourceURI(mySelection.getFullPath().toString()), true);" + NL + "\t\ttry {" + NL + "\t\t\tresource.load(Collections.EMPTY_MAP);" + NL + "\t\t\treturn (EObject) resource.getContents().get(0);" + NL + "\t\t} catch (IOException ex) {" + NL + "\t\t\tex.printStackTrace();" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate void save(String filePath, EObject canvas) {" + NL + "\t\tResource resource = myResSet.createResource(URI.createURI(filePath));" + NL + "\t\tresource.getContents().add(canvas);" + NL + "\t\ttry {" + NL + "\t\t\tresource.save(Collections.EMPTY_MAP);" + NL + "\t\t} catch (IOException ex) {" + NL + "\t\t\tex.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tpublic void selectionChanged(IAction action, ISelection selection) {" + NL + "\t\tmySelection = null;" + NL + "\t\taction.setEnabled(false);" + NL + "\t\tif (selection instanceof IStructuredSelection == false || selection.isEmpty()) {" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tmySelection = (IFile) ((IStructuredSelection) selection).getFirstElement();" + NL + "\t\taction.setEnabled(true);" + NL + "\t}" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */\t" + NL + "\tpublic String isValid(String newText) {" + NL + "\t\tIStatus status = ResourcesPlugin.getWorkspace().validateName(newText, IResource.FILE);" + NL + "\t\tif (!status.isOK()) {" + NL + "\t\t\treturn status.getMessage();" + NL + "\t\t}" + NL + "\t\tif (mySelection.getParent().getFile(new Path(newText).addFileExtension(FILE_EXT)).exists()) {" + NL + "\t\t\treturn \"File already exists, choose another name\";" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate Shell getShell() {" + NL + "\t\treturn myPart.getSite().getShell();" + NL + "\t}" + NL + "\t" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate interface LinkFactory {" + NL + "\t\t" + NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tboolean isApplicable(DiagramNode node);" + NL + "\t\t" + NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tvoid createLinks(DiagramNode node, DiagramCanvas diagramCanvas);" + NL + "\t\t" + NL + "\t}" + NL + "\t";
  protected final String TEXT_35 = NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "\tprivate class LinkFactoryImpl";
  protected final String TEXT_36 = " implements LinkFactory {" + NL + "\t\t" + NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tpublic boolean isApplicable(DiagramNode node) {" + NL + "\t\t\tEObject modelObject = node.getDomainModelElement();" + NL + "\t\t\tEClass modelObjectEClass = modelObject.eClass();";
  protected final String TEXT_37 = NL + "\t\t\tfor (Iterator it = modelObjectEClass.getEAllStructuralFeatures().iterator(); it.hasNext();) {" + NL + "\t\t\t\tif (";
  protected final String TEXT_38 = ".eINSTANCE.get";
  protected final String TEXT_39 = "().equals(it.next())) {" + NL + "\t\t\t\t\treturn true;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tpublic void createLinks(DiagramNode node, DiagramCanvas diagramCanvas) {" + NL + "\t\t\tEObject modelObject = node.getDomainModelElement();";
  protected final String TEXT_40 = "\t\t\t" + NL + "\t\t\tEStructuralFeature structuralFeature = ";
  protected final String TEXT_41 = ".eINSTANCE.get";
  protected final String TEXT_42 = "();" + NL + "\t\t\tObject structuralFeatureResult = modelObject.eGet(structuralFeature);" + NL + "\t\t\tif (structuralFeatureResult instanceof Collection) {" + NL + "\t\t\t\tfor (Iterator it = ((Collection) structuralFeatureResult).iterator(); it.hasNext();) {" + NL + "\t\t\t\t\tEObject nextLinkTarget = (EObject) it.next();" + NL + "\t\t\t\t\tDiagramNode targetNode = null;" + NL + "\t\t\t\t\tif (vetoLinkCreation(modelObject, nextLinkTarget)) {" + NL + "\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\ttargetNode = getDiagramNode(nextLinkTarget);";
  protected final String TEXT_43 = NL + "\t\t\tEStructuralFeature containmentFeature = ";
  protected final String TEXT_44 = ".eINSTANCE.get";
  protected final String TEXT_45 = "();" + NL + "\t\t\tObject containmentFeatureResult = modelObject.eGet(containmentFeature);" + NL + "\t\t\tif (containmentFeatureResult instanceof Collection) {" + NL + "\t\t\t\tfor (Iterator it = ((Collection) containmentFeatureResult).iterator(); it.hasNext();) {" + NL + "\t\t\t\t\tEObject modelLinkObject = (EObject) it.next();" + NL + "\t\t\t\t\tDiagramNode targetNode = null;";
  protected final String TEXT_46 = NL + "\t\t\t\t\tEClass modelLinkObjectEClass = modelLinkObject.eClass();" + NL + "            \t\tif (!";
  protected final String TEXT_47 = ".eINSTANCE.get";
  protected final String TEXT_48 = "().equals(modelLinkObjectEClass)) {" + NL + "            \t\t\tcontinue;" + NL + "            \t\t}";
  protected final String TEXT_49 = NL + "\t\t\t\t\tEStructuralFeature structuralFeature = ";
  protected final String TEXT_50 = ".eINSTANCE.get";
  protected final String TEXT_51 = "();" + NL + "\t\t\t\t\tif (structuralFeature == null) {" + NL + "\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tObject structuralFeatureResult = modelLinkObject.eGet(structuralFeature);" + NL + "\t\t\t\t\tif (structuralFeatureResult instanceof EObject == false) {" + NL + "\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tif (vetoLinkCreation(modelObject, (EObject) structuralFeatureResult, modelLinkObject)) {" + NL + "\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\ttargetNode = getDiagramNode((EObject) structuralFeatureResult);";
  protected final String TEXT_52 = NL + "\t\t\t\t\tif (targetNode == null) {" + NL + "\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tDiagramLink diagramLink = ";
  protected final String TEXT_53 = ".eINSTANCE.create";
  protected final String TEXT_54 = "();" + NL + "\t\t\t\t\tdiagramLink.setSource(node);" + NL + "\t\t\t\t\tdiagramLink.setUin(diagramCanvas.nextAvailableUin());" + NL + "\t\t\t\t\tdiagramLink.setTarget(targetNode);" + NL + "\t\t\t\t\tdiagramLink.setVisualID(";
  protected final String TEXT_55 = ".VISUAL_ID);" + NL + "\t\t\t\t\tdiagramCanvas.getLinks().add(diagramLink);";
  protected final String TEXT_56 = NL + "\t\t\t\t\tdiagramLink.setDomainModelElement(modelLinkObject);";
  protected final String TEXT_57 = NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_58 = NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tprivate boolean vetoLinkCreation(EObject linkSource, EObject target) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_59 = NL + "\t    /**" + NL + "    \t * @generated" + NL + "    \t */" + NL + "\t\tprivate boolean vetoLinkCreation(EObject linkSource, EObject target, EObject linkObject) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_60 = NL + "\t\t" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_61 = NL + NL + "}";
  protected final String TEXT_62 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    GenDiagram genDiagram = (GenDiagram) argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genDiagram.getEditorPackageName());
    stringBuffer.append(TEXT_2);
    ImportUtil importManager = new ImportUtil(genDiagram.getEditorPackageName());
    stringBuffer.append(TEXT_3);
    importManager.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genDiagram.getInitDiagramFileActionClassName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genDiagram.getDiagramFileExtension());
    stringBuffer.append(TEXT_6);
     GenClass diagramGenClass = genDiagram.getDiagramRunTimeClass();
    stringBuffer.append(TEXT_7);
    stringBuffer.append(importManager.getImportedName(diagramGenClass.getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(diagramGenClass.getInterfaceName());
    stringBuffer.append(TEXT_9);
    
for (Iterator links = genDiagram.getLinks().iterator(); links.hasNext();) {
	GenLink nextGenLink = (GenLink) links.next();

    stringBuffer.append(TEXT_10);
    stringBuffer.append(nextGenLink.getVisualID());
    stringBuffer.append(TEXT_11);
    
}

    stringBuffer.append(TEXT_12);
    
for (Iterator nodes = genDiagram.getNodes().iterator(); nodes.hasNext();) {
	GenNode nextGenNode = (GenNode) nodes.next();
	GenClass nextGenNodeGenClass = nextGenNode.getDomainMetaClass();

    stringBuffer.append(TEXT_13);
    stringBuffer.append(importManager.getImportedName(nextGenNodeGenClass.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(nextGenNodeGenClass.getInterfaceName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(nextGenNode.getVisualID());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    
for (Iterator nodes = genDiagram.getNodes().iterator(); nodes.hasNext();) {
	GenNode nextGenNode = (GenNode) nodes.next();
	GenClass nextNodeRuntimeGenClass = nextGenNode.getDiagramRunTimeClass();

    stringBuffer.append(TEXT_18);
    stringBuffer.append(nextGenNode.getVisualID());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(importManager.getImportedName(nextNodeRuntimeGenClass.getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(nextNodeRuntimeGenClass.getInterfaceName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName(nextGenNode.getEditPartQualifiedClassName()));
    stringBuffer.append(TEXT_22);
    
	for (Iterator childNodes = nextGenNode.getChildNodes().iterator(); childNodes.hasNext();) {
		GenChildNode nextChildGenNode = (GenChildNode) childNodes.next();
		GenClass nextChildNodeRuntimeGenClass = nextChildGenNode.getDiagramRunTimeClass();
		GenClass nextChildNodeDomainGenClass = nextChildGenNode.getDomainMetaClass();

    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName(nextChildNodeDomainGenClass.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(nextChildNodeDomainGenClass.getInterfaceName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName(nextChildNodeRuntimeGenClass.getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(nextChildNodeRuntimeGenClass.getInterfaceName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(nextChildGenNode.getGroupID());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName(nextChildGenNode.getEditPartQualifiedClassName()));
    stringBuffer.append(TEXT_29);
    	}
    stringBuffer.append(TEXT_30);
    stringBuffer.append(nextGenNode.getVisualID());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(nextGenNode.getVisualID());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(nextGenNode.getVisualID());
    stringBuffer.append(TEXT_33);
    }
    stringBuffer.append(TEXT_34);
    
for (Iterator links = genDiagram.getLinks().iterator(); links.hasNext();) {
	GenLink nextGenLink = (GenLink) links.next();
	boolean referenceOnly = false;
	GenFeature containmentGenFeature = null;
	GenClass domainMetaElementGenClass = null;
	if (nextGenLink instanceof GenLinkReferenceOnly) {
		referenceOnly = true;
	} else {
		containmentGenFeature = nextGenLink.getContainmentMetaFeature();
		GenLinkWithClass withClassLink = (GenLinkWithClass) nextGenLink;
		if (withClassLink.getDomainMetaClass() != null) {
			domainMetaElementGenClass = withClassLink.getDomainMetaClass();
		}
	}
	
	GenClass nextLinkRuntimeGenClass = nextGenLink.getDiagramRunTimeClass();
	GenFeature domainLinkTargetGenFeature = nextGenLink.getDomainLinkTargetFeature();

    stringBuffer.append(TEXT_35);
    stringBuffer.append(nextGenLink.getVisualID());
    stringBuffer.append(TEXT_36);
    
	GenFeature genFeature;
	if (referenceOnly) {
		genFeature = domainLinkTargetGenFeature;
	} else {
		genFeature = containmentGenFeature;
	}

    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName(genFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_39);
    
	if (referenceOnly) {

    stringBuffer.append(TEXT_40);
    stringBuffer.append(importManager.getImportedName(domainLinkTargetGenFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(domainLinkTargetGenFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_42);
    	
	} else {

    stringBuffer.append(TEXT_43);
    stringBuffer.append(importManager.getImportedName(containmentGenFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(containmentGenFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_45);
    
		if (domainMetaElementGenClass != null) {

    stringBuffer.append(TEXT_46);
    stringBuffer.append(importManager.getImportedName(domainMetaElementGenClass.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(domainMetaElementGenClass.getInterfaceName());
    stringBuffer.append(TEXT_48);
    
		}

    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName(domainLinkTargetGenFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(domainLinkTargetGenFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_51);
    
	}

    stringBuffer.append(TEXT_52);
    stringBuffer.append(importManager.getImportedName(nextLinkRuntimeGenClass.getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(nextLinkRuntimeGenClass.getInterfaceName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName(nextGenLink.getEditPartQualifiedClassName()));
    stringBuffer.append(TEXT_55);
    
	if (!referenceOnly) {

    stringBuffer.append(TEXT_56);
    
	}

    stringBuffer.append(TEXT_57);
    
	if (referenceOnly) {

    stringBuffer.append(TEXT_58);
    
	} else {

    stringBuffer.append(TEXT_59);
    
	}

    stringBuffer.append(TEXT_60);
    
}

    stringBuffer.append(TEXT_61);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_62);
    return stringBuffer.toString();
  }
}
