package cardGame;

import java.util.TreeSet;

public class Player implements Comparable<Player> {
	
	private String name;
	private TreeSet<Card> hand;
	
	public Player(String name) {
		this.name = name;
		this.hand = new TreeSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		this.hand.add(card);
	}
	
	public Card getHighestPoweredCard() {
		return this.hand.last();
	}
	
	public int getCardCount() {
		return this.hand.size();
	}
	
	@Override
	public int compareTo(Player other) {
		return getHighestPoweredCard().compareTo(other.getHighestPoweredCard());
	}
	
	@Override
	public String toString() {
		return String.format("%s wins with %s of %s.", this.getName(), getHighestPoweredCard().getRanks(), getHighestPoweredCard().getSuits());
	}
}
