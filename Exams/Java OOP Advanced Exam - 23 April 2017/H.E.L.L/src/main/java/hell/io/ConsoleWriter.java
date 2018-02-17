package hell.io;

import hell.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
	
	@Override
	public void writeLine(String output) {
		System.out.print(output);
	}
	
	@Override
	public void writeLine(String format, Object... params) {
		//TODO
	}
}
