package foodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Buyer> result = new HashMap<>();
		int num = Integer.valueOf(read.readLine());
		
		for (int i = 0; i < num; i++) {
			String[] input = read.readLine().split("\\s+");
			
			if (input.length > 3) {
				String name = input[0];
				int age = Integer.valueOf(input[1]);
				String id = input[2];
				String birthday = input[3];
				Buyer citizen = new Citizen(name, age, id, birthday);
				result.putIfAbsent(name, citizen);
			} else {
				String name = input[0];
				int age = Integer.valueOf(input[1]);
				String group = input[2];
				Buyer rebel = new Rebel(name, age, group);
				result.putIfAbsent(name, rebel);
			}
		}
		String names;
		
		while (!(names = read.readLine()).equals("End")) {
			if (result.containsKey(names)) {
				result.get(names).buyFood();
			}
		}
		int food = 0;
		for (Buyer buyer : result.values()) {
			food += buyer.getFood();
		}
		System.out.println(food);
	}
}
