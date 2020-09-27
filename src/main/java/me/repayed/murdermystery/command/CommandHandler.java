package me.repayed.murdermystery.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Set;

public class CommandHandler implements CommandExecutor {

    private final Set<SubCommand> subCommandSet = null;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return true;
    }
}
