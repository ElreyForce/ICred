package org.elreyforce.mc.ICred;

import org.bukkit.block.Block;

public class ICredBlock {
	final String world;
	final int x, y, z;
	
	// Constructor
	ICredBlock(Block block) {
		this.world = block.getWorld().getName();
		this.x = block.getX();
		this.y = block.getY();
		this.z = block.getZ();
	}
}
