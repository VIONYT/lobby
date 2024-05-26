package moe.vion.lobby;

import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

public final class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        @Nullable RegisteredServiceProvider<LuckPerms> provider = Bukkit.getServicesManager().getRegistration(LuckPerms.class);
        Bukkit.getConsoleSender().sendMessage("Lobby-Plugin startet!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
