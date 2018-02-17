package barracksWars.interfaces;

public interface CommandInterpreter {
	barracksWars.interfaces.Executable interpretCommand(String[] data, String commandName);
}
