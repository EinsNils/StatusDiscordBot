package de.nils.command;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public interface ICommand {

    public String getName();
    public String getDescription();
    public CommandData getCommandData();
    public void execute(SlashCommandInteractionEvent event);
}
