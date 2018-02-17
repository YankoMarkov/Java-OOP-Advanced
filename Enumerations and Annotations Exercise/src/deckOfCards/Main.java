package deckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		Ranks[] ranks = Ranks.values();
		Suits[] suits = Suits.values();
		
		for (Suits suit : suits) {
			for (Ranks rank : ranks) {
				System.out.printf("%s of %s%n", rank, suit);
			}
		}
	}
}
