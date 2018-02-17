package logger;

import logger.factories.AppenderFactoryImpl;
import logger.interfaces.AppenderFactory;
import logger.interfaces.Reader;
import logger.interfaces.Runnable;
import logger.interfaces.Writer;
import logger.io.ConsoleReader;
import logger.io.ConsoleWriter;
import logger.models.Engine;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException, ReflectiveOperationException {
		
		Reader reader = new ConsoleReader();
		Writer writer = new ConsoleWriter();
		AppenderFactory appenderFactory = new AppenderFactoryImpl();
		Runnable engine = new Engine(reader,writer,appenderFactory);
		engine.run();
	}
}
