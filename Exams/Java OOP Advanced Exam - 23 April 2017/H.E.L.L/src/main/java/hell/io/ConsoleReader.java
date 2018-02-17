package hell.io;

import hell.interfaces.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader implements InputReader {
	
	private BufferedReader read;
	
	public ConsoleReader() {
		this.read = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public String readLine() {
		String result = "";
		try {
			result = read.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
