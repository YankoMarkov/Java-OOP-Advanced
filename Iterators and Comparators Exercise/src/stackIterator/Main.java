package stackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StackIterator<Integer> stackIterator = new StackIterator<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("[,\\s]+");
			
			try {
				switch (input[0]) {
					case "Push":
						for (int i = 1; i < input.length; i++) {
							stackIterator.push(Integer.valueOf(input[i]));
						}
						break;
					case "Pop":
						stackIterator.pop();
						break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		for (Integer integer : stackIterator) {
			System.out.println(integer);
		}
		for (Integer integer : stackIterator) {
			System.out.println(integer);
		}
	}
}
