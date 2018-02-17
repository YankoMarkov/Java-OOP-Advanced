package borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Identifiable> result = new HashMap<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split("\\s+");
			
			if (input.length > 2) {
				String name = input[0];
				int age = Integer.valueOf(input[1]);
				String id = input[2];
				Identifiable citizen = new Citizen(name, age, id);
				result.putIfAbsent(id, citizen);
			} else if (input.length == 2) {
				String model = input[0];
				String id = input[1];
				Identifiable robot = new Robot(model, id);
				result.putIfAbsent(id, robot);
			}
		}
		String command = read.readLine();
		StringBuilder res = new StringBuilder();
		for (String id : result.keySet()) {
			if (id.endsWith(command)) {
				res.append(result.get(id).getId()).append("\n");
			}
		}
		if (res.length() > 0) {
			System.out.print(res.toString().trim());
		}
	}
}
