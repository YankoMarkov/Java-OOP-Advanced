package logger.io;


import logger.interfaces.Writer;

public class ConsoleWriter implements Writer {
	
	@Override
	public void writeLine(String output) {
		System.out.println(output);
	}
}
