package hell.enums;

public enum HeroType {
	
	BARBARIAN,
	ASSASSIN,
	WIZARD;
	
	@Override
	public String toString() {
		char upper = this.name().charAt(0);
		char lower = Character.toLowerCase(upper);
		return this.name().toLowerCase().replace(lower, upper);
	}
}
