package infernoInfinity;

import infernoInfinity.core.DatabaseImpl;
import infernoInfinity.core.InfinityEngine;
import infernoInfinity.core.interfaces.Database;
import infernoInfinity.core.interfaces.Engine;
import infernoInfinity.io.ConsoleReader;
import infernoInfinity.io.ConsoleWriter;
import infernoInfinity.io.interfaces.Reader;
import infernoInfinity.io.interfaces.Writer;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Reader reader = new ConsoleReader();
		Writer writer = new ConsoleWriter();
		Database database = new DatabaseImpl();
		Engine engine = new InfinityEngine(reader, writer, database);
		engine.run();
	}
}
