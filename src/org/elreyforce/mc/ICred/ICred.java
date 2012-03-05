package org.elreyforce.mc.ICred;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class ICred extends JavaPlugin {
	
	Logger log;
	private ICredCommandExecutor cmdExecutor;
	private ICredListener plgListener;
	
	public void onEnable(){
		
		// Bind Logger
		log = this.getLogger();
		
		// Init Command Executor
		cmdExecutor = new ICredCommandExecutor(this);
		
		// Init Event Listener
		plgListener = new ICredListener(this);
		
		log.info("ICred Version 0.1 enabled.");
	}
	 
	public void onDisable(){ 
		log.info("ICred Version 0.1 disabled.");
	}
	

}
