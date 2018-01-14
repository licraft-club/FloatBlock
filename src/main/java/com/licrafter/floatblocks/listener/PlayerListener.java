package com.licrafter.floatblocks.listener;

import com.licrafter.floatblocks.FloatBlockPlugin;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shell on 2017/11/29.
 * <p>
 * Github: https://github.com/shellljx
 */
public class PlayerListener implements Listener {

    private FloatBlockPlugin plugin;

    //private Hologram hologram;

    public PlayerListener(FloatBlockPlugin plugin) {
        this.plugin = plugin;
    }

//    @EventHandler
//    public void onPlayerJoin(PlayerJoinEvent event) {
//        List<String> list = new ArrayList<>();
//        list.add("神光套装");
//        Player player = event.getPlayer();
//        hologram = HologramsAPI.createHologram(plugin, player.getLocation());
//        ItemStack wool = new ItemStack(35,1,(short)11);
//        wool.getItemMeta().setLore(list);
//        wool.getItemMeta().setDisplayName("哈哈哈");
//        hologram.appendItemLine(wool);
//        hologram.teleport(player.getLocation().add(0,3,0));
//    }
//
//    @EventHandler
//    public void onPlayerMove(PlayerMoveEvent event){
//        hologram.teleport(event.getPlayer().getLocation().add(0,3,0));
//    }
}
