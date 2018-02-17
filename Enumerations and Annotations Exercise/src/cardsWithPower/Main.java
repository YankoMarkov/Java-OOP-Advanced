package cardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Ranks ranks = Ranks.valueOf(read.readLine());
		Suits suits = Suits.valueOf(read.readLine());
		
		int power = ranks.getRanksPower() + suits.getSuitsPower();
		System.out.printf("Card name: %s of %s; Card power: %d", ranks.name(), suits.name(), power);
	}
}
