package com.licrafter.floatblocks.cmds;

import com.licrafter.floatblocks.FloatBlockPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by shell on 2018/1/15.
 * <p>
 * Github: https://github.com/shellljx
 */
public class PlayerCmds implements CommandExecutor {

    private FloatBlockPlugin plugin;

    public PlayerCmds(FloatBlockPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return true;
    }
}
