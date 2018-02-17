package cardToString;

public class Card {
	
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
}
