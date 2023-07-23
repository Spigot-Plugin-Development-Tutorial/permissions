package me.kodysimpson.permissions;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            if (p.hasPermission("permissions.test")){
                p.sendMessage("Wow you have so much swag");
            }else{
                p.sendMessage("You do not have permission to run this command BOZO.");
            }

        }

        return true;
    }
}
