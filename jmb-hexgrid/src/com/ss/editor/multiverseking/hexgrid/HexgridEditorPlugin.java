package com.ss.editor.multiverseking.hexgrid;

import org.jetbrains.annotations.NotNull;

import com.ss.editor.plugin.EditorPlugin;
import com.ss.rlib.plugin.PluginContainer;
import com.ss.rlib.plugin.PluginSystem;
import com.ss.rlib.plugin.annotation.PluginDescription;

/**
 * The implementation of an editor plugin.
 *
 * @author JavaSaBr
 */
@PluginDescription(
        id = "com.ss.editor.jmb-hexgrid",
        version = "0.0.1",
        name = "Multiverseking Hexgrid plugin",
        description = "Provides integration of an hexagonal grid generator : 'multiverseking.hergrid'. "
)

public class HexgridEditorPlugin extends EditorPlugin {

	public HexgridEditorPlugin(@NotNull PluginContainer pluginContainer) {
		super(pluginContainer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onAfterCreateJmeContext(@NotNull PluginSystem pluginSystem) {
		// TODO Auto-generated method stub
		super.onAfterCreateJmeContext(pluginSystem);
	}

	@Override
	public void onAfterCreateJavaFxContext(@NotNull PluginSystem pluginSystem) {
		// TODO Auto-generated method stub
		super.onAfterCreateJavaFxContext(pluginSystem);
	}

}
