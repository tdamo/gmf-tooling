/**
 * Copyright (c) 2007, 2009, 2013 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 *    Michael Golubev (Montages) - #386838 - migrate to Xtend2
 */
package xpt.diagram.updater

import com.google.inject.Inject
import org.eclipse.gmf.codegen.gmfgen.GenDiagramUpdater

@com.google.inject.Singleton class extensions {
	@Inject extension xpt.Common;

	def extensions(GenDiagramUpdater it) '''
		<extension point="org.eclipse.ui.commands" id="update-cmd">
		   «xmlGeneratedTag»
		   <command
		      categoryId="org.eclipse.ui.category.edit"
		      defaultHandler="«getUpdateCommandQualifiedClassName()»"
		      description="%update.diagram.description"
		      id="«updateCommandID»"
		      name="%update.diagram.name"/>
		</extension>
		
		<extension point="org.eclipse.ui.bindings" id="update-cmd-binding">
		   «xmlGeneratedTag»
		   <key 
		      commandId="«updateCommandID»"
		      contextId="«editorGen.editor.contextID»"
		      schemeId="org.eclipse.ui.defaultAcceleratorConfiguration"
		      sequence="F5"/>
		</extension>
	'''
}
