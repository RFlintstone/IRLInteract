package irlinteract.maincode;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class IRLInteract extends JavaPlugin {
     Events myEvents = new Events();

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(myEvents, this);

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Debugger!");

        getServer().getConsoleSender().sendMessage(
                ".___  __________  .____        .___        __                              __   \n" +
                        "|   | \\______   \\ |    |       |   | _____/  |_  ________________    _____/  |_ \n" +
                        "|   |  |       _/ |    |       |   |/    \\   __\\/ __ \\_  __ \\__  \\ _/ ___\\   __\\\n" +
                        "|   |  |    |   \\ |    |___    |   |   |  \\  | \\  ___/|  | \\// __ \\\\  \\___|  |  \n" +
                        "|___|  |____|_  / |_______ \\   |___|___|  /__|  \\___  >__|  (____  /\\___  >__|  \n" +
                        "              \\/          \\/            \\/          \\/           \\/     \\/      \n" +
                        "             ___________            ___.   .__             .___                 \n" +
                        "             \\_   _____/ ____ _____ \\_ |__ |  |   ____   __| _/                 \n" +
                        "              |    __)_ /    \\\\__  \\ | __ \\|  | _/ __ \\ / __ |                  \n" +
                        "              |        \\   |  \\/ __ \\| \\_\\ \\  |_\\  ___// /_/ |                  \n" +
                        "             /_______  /___|  (____  /___  /____/\\___  >____ |                  \n" +
                        "                     \\/     \\/     \\/    \\/          \\/     \\/                  "
        );



        getServer().getScheduler().runTaskTimer(this, () ->
            Unirest.get("https://data.buienradar.nl/2.0/feed/json").asJsonAsync(new Callback<JsonNode>(){
                @Override
                public void completed(HttpResponse<JsonNode> response) {
                    getServer().broadcastMessage(response.getBody().toString());
                    getLogger().info(response.getBody().toString());
                }

                @Override
                public void failed(UnirestException e) {
                    e.printStackTrace();
                }

                @Override
                public void cancelled() {

                }
            }), 0, 20*30);
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(
                ".___  __________  .____        .___        __                              __   \n" +
                        "|   | \\______   \\ |    |       |   | _____/  |_  ________________    _____/  |_ \n" +
                        "|   |  |       _/ |    |       |   |/    \\   __\\/ __ \\_  __ \\__  \\ _/ ___\\   __\\\n" +
                        "|   |  |    |   \\ |    |___    |   |   |  \\  | \\  ___/|  | \\// __ \\\\  \\___|  |  \n" +
                        "|___|  |____|_  / |_______ \\   |___|___|  /__|  \\___  >__|  (____  /\\___  >__|  \n" +
                        "              \\/          \\/            \\/          \\/           \\/     \\/      \n" +
                        "             ________  .__              ___.   .__             .___             \n" +
                        "             \\______ \\ |__| ___________ \\_ |__ |  |   ____   __| _/             \n" +
                        "              |    |  \\|  |/  ___/\\__  \\ | __ \\|  | _/ __ \\ / __ |              \n" +
                        "              |    `   \\  |\\___ \\  / __ \\| \\_\\ \\  |_\\  ___// /_/ |              \n" +
                        "             /_______  /__/____  >(____  /___  /____/\\___  >____ |              \n" +
                        "                     \\/        \\/      \\/    \\/          \\/     \\/              "
        );
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "This command works!");
        if (command.getName().equalsIgnoreCase("test")) {
            Player player = Bukkit.getPlayer("R_Flintstone");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "You are awesome!!!+");
        }
        return true;
    }
}