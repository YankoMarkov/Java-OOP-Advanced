package barracksWars;

import barracksWars.interfaces.CommandInterpreter;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.Runnable;
import barracksWars.interfaces.UnitFactory;
import barracksWars.core.CommandInterpreterImpl;
import barracksWars.core.Engine;
import barracksWars.core.factories.UnitFactoryImpl;
import barracksWars.data.UnitRepository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws IllegalAccessException, IOException, InvocationTargetException {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		CommandInterpreter interpreter = new CommandInterpreterImpl(repository, unitFactory);
		Runnable engine = new Engine(interpreter);
		engine.run();
	}
}
