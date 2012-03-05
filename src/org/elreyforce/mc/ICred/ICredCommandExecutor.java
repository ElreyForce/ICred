package org.elreyforce.mc.ICred;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ICredCommandExecutor implements CommandExecutor {
	
	private ICred ICred;

	public ICredCommandExecutor(ICred ICred) {
		this.ICred = ICred;
		
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		String subCommand;
		
		if (args.length == 0) {
			subCommand = "help";
		} else {
			subCommand = args[0].toLowerCase();
		}
		
		// Commands that can be invoked on Console or by Player 
			
		// Help command 
		if (subCommand.equals("help") && checkPermission(sender, perHelp)) {
			return this.cmdHelp(sender, cmd, commandLabel, args);
		}
		if (subCommand.equals("version") && checkPermission(sender, perVersion)) {
			return this.cmdVersion(sender, cmd, commandLabel, args);
		}

		// Commands that can only be invoked by a Player
		if (sender instanceof Player) {

		} else { // Commands that can only be invoked on Console
		
		}

		return true;
	}
	
	public String perHelp = "icred.help";
	public boolean cmdHelp(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		sender.sendMessage("Help: ");
		return true;
	}
	
	public String perVersion = "icred.version";
	public boolean cmdVersion(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		sender.sendMessage("Version: " + ICred.getDescription().getVersion());
		return true;
	}
	
	public boolean checkPermission(CommandSender sender, String permission) {
		if (sender.hasPermission(permission)) {
			return true;
		} else {
			sender.sendMessage("You don't have the permissions for this command! (" + permission + ")");
			return false;
		}
	}
}
