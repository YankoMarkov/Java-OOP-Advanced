package infernoInfinity.io;

import infernoInfinity.io.interfaces.Writer;

public class ConsoleWriter implements Writer {
	
	@Override
	public void write(Object message) {
		System.out.println(message);
	}
}
