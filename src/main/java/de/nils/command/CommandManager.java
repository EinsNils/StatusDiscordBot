package de.nils.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    @Getter
    private List<ICommand> commands = new ArrayList<>();

    public void register(ICommand command) {
        commands.add(command);
    }
}
