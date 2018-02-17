package mood3;

public class Archangel extends GameObjects {
	
	private int mana;
	
	public Archangel(String username, int level, int mana) {
		super(username, level, "Archangel");
		this.mana = mana;
	}
	
	public int getMana() {
		return mana;
	}
	
	@Override
	protected String generateHeshedPassword() {
		StringBuilder res = new StringBuilder(this.getUsername()).reverse();
		res.append(String.format("%d", res.toString().length() * 21));
		return res.toString();
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s", super.toString(), getMana() * getLevel());
	}
}
