package winlyps.elytraBoost

import org.bukkit.plugin.java.JavaPlugin

class ElytraBoost : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(ElytraEventListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}