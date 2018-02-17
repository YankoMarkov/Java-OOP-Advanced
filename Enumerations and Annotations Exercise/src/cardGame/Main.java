package cardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Set<Card> deck = new TreeSet<>();
		
		Player firstPlayer = new Player(read.readLine());
		Player secondPlayer = new Player(read.readLine());
		
		addCard(read, deck, firstPlayer);
		addCard(read, deck, secondPlayer);
		
		Player winner = firstPlayer;
		if (secondPlayer.compareTo(firstPlayer) > 0) {
			winner = secondPlayer;
		}
		System.out.println(winner);
	}
	
	private static void addCard(BufferedReader read, Set<Card> deck, Player player) throws IOException {
		while (player.getCardCount() < 5) {
			String[] input = read.readLine().split("[\\sof]+");
			
			Ranks ranks;
			Suits suits;
			
			try {
				ranks = Ranks.valueOf(input[0]);
				suits = Suits.valueOf(input[1]);
			} catch (IllegalArgumentException e) {
				System.out.println("No such card exists.");
				continue;
			}
			Card card = new Card(ranks, suits);
			if (deck.contains(card)) {
				System.out.println("Card is not in the deck.");
				continue;
			}
			player.addCard(card);
			deck.add(card);
		}
	}
}
