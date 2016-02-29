/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SetCommandBlock extends JavaPlugin {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(new SetCommandBlock_Listerer(), this);
	}


	public void onDisable() {

	}
}


