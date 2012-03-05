package org.elreyforce.mc.ICred;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ICred extends JavaPlugin {
	
	Logger log;
	private ICredCommandExecutor cmdExecutor;
	
	public void onEnable(){
		log = this.getLogger();
		
		cmdExecutor = new ICredCommandExecutor(this);
		getCommand("icred").setExecutor(cmdExecutor);
		
		log.info("ICred Version 0.1 enabled.");
	}
	 
	public void onDisable(){ 
		log.info("ICred Version 0.1 disabled.");
	}
	

}
