package cardCompareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Ranks ranks1 = Ranks.valueOf(read.readLine());
		Suits suits1 = Suits.valueOf(read.readLine());
		Card card1 = new Card(ranks1, suits1);
		
		Ranks ranks2 = Ranks.valueOf(read.readLine());
		Suits suits2 = Suits.valueOf(read.readLine());
		Card card2 = new Card(ranks2, suits2);
		
		if (card1.compareTo(card2) > 0) {
			System.out.println(card1);
		} else if (card2.compareTo(card1) > 0) {
			System.out.println(card2);
		} else {
			System.out.println(card1);
		}
	}
}
