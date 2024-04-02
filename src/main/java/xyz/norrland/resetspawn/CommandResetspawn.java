package xyz.norrland.resetspawn;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandResetspawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setRespawnLocation(null);
            player.sendMessage("Respawn reset");
        } else {
            sender.sendMessage("You need to be a player to run this command");
        }

        return true;
    }
}
