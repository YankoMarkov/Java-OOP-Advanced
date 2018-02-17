package models.commands;

import interfaces.commands.Command;
import interfaces.commands.Executor;

public class CommandExecutor implements Executor {
	
	@Override
	public void executeCommand(Command command) {
		command.execute();
	}
}
