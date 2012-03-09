package org.elreyforce.mc.ICred;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;

public class ICredBlock {
	final String world;
	final int x, y, z;
	String TypeID;
	
	// Constructor
	ICredBlock(Block block) {
		this.world = block.getWorld().getName();
		this.x = block.getX();
		this.y = block.getY();
		this.z = block.getZ();
	}
	
	Block getBlock() {
		return Bukkit.getServer().getWorld(this.world).getBlockAt(this.x, this.y, this.z);
	}
}
