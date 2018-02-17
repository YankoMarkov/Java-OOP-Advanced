package mood3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String[] input = read.readLine().split("[\\s|]+");
		
		String username = input[0];
		String type = input[1];
		int level = Integer.valueOf(input[3]);
		GameObjects gameObjects = null;
		
		switch (type) {
			case "Demon":
				double energy = Double.valueOf(input[2]);
				gameObjects = new Demon(username, level, energy);
				gameObjects.generateHeshedPassword();
				break;
			case "Archangel":
				int mana = Integer.valueOf(input[2]);
				gameObjects = new Archangel(username, level, mana);
				gameObjects.generateHeshedPassword();
				break;
		}
		if (gameObjects != null) {
			System.out.println(gameObjects);
		}
	}
}
