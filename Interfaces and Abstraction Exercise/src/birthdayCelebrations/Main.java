package birthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		List<Citizen> citizens = new ArrayList<>();
		List<Pet> pets = new ArrayList<>();
		List<Robot> robots = new ArrayList<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("End")) {
			String[] input = inputs.split("\\s+");
			
			switch (input[0]) {
				case "Citizen":
					String name = input[1];
					int age = Integer.valueOf(input[2]);
					String id = input[3];
					String birthday = input[4];
					Citizen citizen = new Citizen(name, age, id, birthday);
					citizens.add(citizen);
					break;
				case "Pet":
					name = input[1];
					birthday = input[2];
					Pet pet = new Pet(name, birthday);
					pets.add(pet);
					break;
				case "Robot":
					name = input[1];
					id = input[2];
					Robot robot = new Robot(name, id);
					robots.add(robot);
					break;
			}
		}
		String command = read.readLine();
		StringBuilder res = new StringBuilder();
		for (Citizen citizen : citizens) {
			if (citizen.birthdate().endsWith(command)) {
				res.append(citizen.birthdate()).append("\n");
			}
		}
		for (Pet pet : pets) {
			if (pet.birthdate().endsWith(command)) {
				res.append(pet.birthdate()).append("\n");
			}
		}
		for (Robot robot : robots) {
			if (robot.id().endsWith(command)) {
				res.append(robot.id()).append("\n");
			}
		}
		if (res.length() > 0) {
			System.out.print(res);
		}
	}
}
