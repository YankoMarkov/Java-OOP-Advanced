package warningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String givenLevel = read.readLine();
		Logger logger = new Logger(Importance.valueOf(givenLevel));
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split(": ");
			String inputLevel = input[0];
			String inputMessage = input[1];
			Message message = new Message(Importance.valueOf(inputLevel), inputMessage);
			logger.add(message);
		}
		for (Message message : logger.getMessages()) {
			System.out.println(message);
		}
	}
}
