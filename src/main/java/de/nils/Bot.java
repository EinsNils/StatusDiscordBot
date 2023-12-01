package de.nils;

import de.nils.command.CommandManager;
import de.nils.listener.SlashCommandListener;
import lombok.Getter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Bot {

    @Getter
    private static Bot instance;
    @Getter
    private static JDA jda;
    @Getter
    private static JDABuilder builder;
    @Getter
    private static CommandManager commandManager;
    public static void main(String[] args) {

        instance = new Bot();

        commandManager = new CommandManager();

        commandManager.register(new de.nils.command.commands.HelloCommand());

        builder = JDABuilder.createDefault("MTE3OTM3MzI3ODMzMTE0NjI2MA.GYvaUk.r4lw0hNqEYautqsNfTn3ULslV5ku96cb1YF_OY")
                        .addEventListeners(new SlashCommandListener())
                        .setAutoReconnect(true)
                        .setStatus(OnlineStatus.ONLINE)
                        .setActivity(Activity.playing("Watching over you!"));


        jda = builder.build();
    }
}