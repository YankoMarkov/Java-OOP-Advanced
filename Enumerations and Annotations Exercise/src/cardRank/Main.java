package cardRank;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Card Ranks:");
		for (CardRank cardSuits : CardRank.values()) {
			System.out.printf("Ordinal value: %s; Name value: %s%n", cardSuits.ordinal(), cardSuits);
		}
	}
}
