package org.eclipse.gmf.tests.xpand.migration;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
public class NativeJavaExtensionsContainer {
@Operation(contextual = false, kind = Kind.HELPER)
public static String simpleNativeExtension(String parameter, Boolean parameter2) { return org.eclipse.gmf.tests.xpand.migration.NativeExtensionsContainer.simpleNativeExtension(parameter, parameter2); }
@Operation(contextual = true, kind = Kind.HELPER)
public String simpleNativePolyExtension(String parameter, Boolean parameter2) { return org.eclipse.gmf.tests.xpand.migration.NativeExtensionsContainer.simpleNativePolyExtension(parameter, parameter2); }
@Operation(contextual = true, kind = Kind.HELPER)
public String simpleNativePolyExtension(Object parameter, Boolean parameter2) { return org.eclipse.gmf.tests.xpand.migration.NativeExtensionsContainer.simpleNativePolyExtension(parameter, parameter2); }
@Operation(contextual = false, kind = Kind.HELPER)
public static org.eclipse.emf.ecore.EClass modelElementAsNativeExtensionParameter(org.eclipse.emf.ecore.EObject param1, org.eclipse.emf.ecore.EPackage param2) { return org.eclipse.gmf.tests.xpand.migration.NativeExtensionsContainer.modelElementAsNativeExtensionParameter(param1, param2); }
@Operation(contextual = false, kind = Kind.HELPER)
public static java.util.List<org.eclipse.emf.ecore.EClass> collectionsInNativeExtensions(java.util.Collection<org.eclipse.emf.ecore.EObject> param1, java.util.Set<org.eclipse.emf.ecore.EPackage> param2, java.util.List<Object> param3, java.util.List<org.eclipse.emf.ecore.EClassifier> param4) { return org.eclipse.ocl.util.CollectionUtil.<org.eclipse.emf.ecore.EClass> createNewSequence(org.eclipse.gmf.tests.xpand.migration.NativeExtensionsContainer.collectionsInNativeExtensions(param1, param2, param3.toArray(new Object[param3.size()]), param4.toArray(new org.eclipse.emf.ecore.EClassifier[param4.size()]))); }
}