package de.nils.listener;

import de.nils.Bot;
import de.nils.command.ICommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SlashCommandListener extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        for (ICommand command : Bot.getInstance().getCommandManager().getCommands()) {
            if (event.getName().equals(command.getName())) {
                command.execute(event);
            }
        }
    }
}
