package cardToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Ranks ranks = Ranks.valueOf(read.readLine());
		Suits suits = Suits.valueOf(read.readLine());
		Card card = new Card(ranks, suits);
		
		System.out.println(card);
	}
}
