package de.nils.command.commands;

import de.nils.Bot;
import de.nils.command.CommandManager;
import de.nils.command.ICommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

/**
 * Created by nilsz
 * Class create at 02.12.2023 00:44
 */
public class HelloCommand implements ICommand {
    @Override
    public String getName() {
        return "hello";
    }

    @Override
    public String getDescription() {
        return "Says hello to you";
    }

    @Override
    public CommandData getCommandData() {
        return Commands.slash(getName(), getDescription());
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        event.reply("Hello " + event.getUser().getAsMention()).queue();

    }
}
