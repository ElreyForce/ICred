package org.elreyforce.mc.ICred;

import org.bukkit.Material;
import org.bukkit.event.Event.Result;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

public class ICredListener implements Listener {

	private ICred ICred;

	public ICredListener(ICred ICred) {
		this.ICred = ICred;
		
		// Register Listener
		ICred.getServer().getPluginManager().registerEvents(this, this.ICred);
	}
	
    @EventHandler
    public Result onBlockPlaced(BlockPlaceEvent event) {
    	event.getPlayer().sendMessage(event.getBlock().getType().name());
        return Result.DEFAULT;
    }
    
    @EventHandler
    public Result onSignChange(SignChangeEvent event) {
    	
    	String[] tmpArray;
    	String SignType;

    	//check Prefix
       if ( ((event.getLine(0).length() > 2) && (event.getLine(0).substring(0,2).equalsIgnoreCase("ir") )) || ((event.getLine(0).length() > 5) && (event.getLine(0).substring(0,5).equalsIgnoreCase("icred")))  ) {
    	   tmpArray = event.getLine(0).split("-",2);
    	   if (tmpArray.length > 1) {
    		   SignType = tmpArray[1];
	    	   if (SignType.equalsIgnoreCase("cake")) {
	    		   event.getBlock().setType(Material.CAKE_BLOCK);
	    	   } else if (SignType.equalsIgnoreCase("diamond")) {
	    		   event.getBlock().setType(Material.DIAMOND_BLOCK);
	    	   }
    	   } else {
    		   event.getPlayer().sendMessage("ICred Syntax: IR-<TYPE>");
    		   event.getPlayer().sendMessage("Example: IR-cake");
    	   }
    	}
    	
        return Result.DEFAULT;
    }
    
    
}
