package de.nils;

import de.nils.command.CommandManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import java.io.ObjectInputFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        JDA jda;
        CommandManager manager;

        JDABuilder builder = JDABuilder.createDefault("MTE3OTM3MzI3ODMzMTE0NjI2MA.GAxQ1M.HiTT7ciz7RZEJMeltI8WvDGy2ME8WThByKJjKg");
        builder.setActivity(Activity.watching("EinsNils beim Programmieren zu!"));
        builder.build();

    }
}