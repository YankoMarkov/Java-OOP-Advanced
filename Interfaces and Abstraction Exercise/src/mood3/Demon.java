package mood3;

public class Demon extends GameObjects {

	private double energy;
	
	public Demon(String username, int level, double energy) {
		super(username, level, "Demon");
		this.energy = energy;
	}
	
	public double getEnergy() {
		return energy;
	}
	
	@Override
	protected String generateHeshedPassword() {
		return String.format("%d", this.getUsername().length() * 217);
	}
	
	@Override
	public String toString() {
		return String.format("%s%n%s", super.toString(), getEnergy() * getLevel());
	}
}
