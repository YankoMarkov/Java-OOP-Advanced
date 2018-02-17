package deckOfCards;

@EnumInfo(
		category = "Suit",
		description = "Provides suit constants for a Card class."
)
public enum Suits {
	
	CLUBS(0),
	DIAMONDS(13),
	HEARTS(26),
	SPADES(39);
	
	private int suitsPower;
	
	Suits(int suitsPower) {
		this.suitsPower = suitsPower;
	}
	
	public int getSuitsPower() {
		return suitsPower;
	}
}
