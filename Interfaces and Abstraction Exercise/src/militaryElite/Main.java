package militaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		CommandInterpretation interpretation = new CommandInterpretation();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split("\\s+");
			
			try {
				interpretation.createSoldier(input);
			} catch (IllegalArgumentException ex) {
			}
		}
	}
}
