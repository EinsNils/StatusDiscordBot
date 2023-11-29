package de.nils.command;

import java.util.ArrayList;

public class CommandManager {

    ArrayList<ICommand> commands = new ArrayList<ICommand>();

    public void registerCommand(ICommand command) {
        commands.add(command);
    }
}
