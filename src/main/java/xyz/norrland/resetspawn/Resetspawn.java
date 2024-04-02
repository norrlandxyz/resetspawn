package xyz.norrland.resetspawn;

import org.bukkit.plugin.java.JavaPlugin;

public final class Resetspawn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello World!");
        this.getCommand("resetspawn").setExecutor(new CommandResetspawn());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
