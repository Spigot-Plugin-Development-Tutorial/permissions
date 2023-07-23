package me.kodysimpson.permissions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Permissions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("test").setExecutor(new TestCommand());

        getServer().getPluginManager().registerEvents(new BlockBreakerListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
