package net.daechler.mobsleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MobSleep extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the event listener
        Bukkit.getPluginManager().registerEvents(this, this);

        // Print an enabling message
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "MobSleep has been enabled!");
    }

    @Override
    public void onDisable() {
        // Print a disabling message
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "MobSleep has been disabled!");
    }

    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        // Force the player to sleep, even if mobs are close by
        event.setUseBed(Event.Result.ALLOW);
    }
}
