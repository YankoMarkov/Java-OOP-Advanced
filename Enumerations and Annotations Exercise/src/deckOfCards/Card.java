package deckOfCards;

public class Card implements Comparable<Card> {
	
	private Ranks ranks;
	private Suits suits;
	private int power;
	
	public Card(Ranks ranks, Suits suits) {
		this.ranks = ranks;
		this.suits = suits;
		this.power = 0;
	}
	
	public Ranks getRanks() {
		return ranks;
	}
	
	public Suits getSuits() {
		return suits;
	}
	
	public int getPower() {
		return this.ranks.getRanksPower() + this.suits.getSuitsPower();
	}
	
	@Override
	public String toString() {
		return String.format("Card name: %s of %s; Card power: %d", this.getRanks(), this.getSuits(), this.getPower());
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null || this.getClass() != other.getClass()) {
			return false;
		}
		Card card = (Card) other;
		
		if (this.ranks != card.ranks) {
			return false;
		}
		return this.suits == card.suits;
	}
	
	@Override
	public int hashCode() {
		int result = this.ranks.hashCode();
		result = 31 * result + this.suits.hashCode();
		return result;
	}
	
	@Override
	public int compareTo(Card other) {
		return Integer.compare(this.getPower(), other.getPower());
	}
}
