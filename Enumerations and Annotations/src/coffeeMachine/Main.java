package coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("\\s+");
			
			try {
				coffeeMachine.insertCoin(input[0]);
			} catch (IllegalArgumentException e) {
				coffeeMachine.buyCoffee(input[0], input[1]);
			}
		}
		for (Coffee coffee : coffeeMachine.coffeesSold()) {
			System.out.println(coffee);
		}
	}
}
