package de.nils.listener;

import de.nils.Bot;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Created by nilsz
 * Class create at 02.12.2023 00:46
 */
public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {
        var guildById = event.getJDA().getGuildById(1151167362633060512L);
        System.out.println("Startup on " + guildById.getName());

        for(var command: Bot.getInstance().getCommandManager().getCommands()) {
            guildById.upsertCommand(command.getCommandData()).queue();
        }

    }

}
