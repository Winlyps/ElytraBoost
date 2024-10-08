package winlyps.elytraBoost

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class ElytraEventListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player: Player = event.player
        if (player.isGliding) {
            applySlowFallingEffect(player)
        }
    }

    private fun applySlowFallingEffect(player: Player) {
        player.addPotionEffect(PotionEffect(PotionEffectType.SLOW_FALLING, 15 * 20, 0, false, false, false))
    }
}