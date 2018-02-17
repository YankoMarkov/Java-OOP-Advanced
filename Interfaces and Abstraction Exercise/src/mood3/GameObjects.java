package mood3;

public abstract class GameObjects {

	private String username;
	private String hashedPassword;
	private int level;
	private String specialPointType;
	
	public GameObjects(String username, int level, String type) {
		this.username = username;
		this.level = level;
		this.specialPointType = type;
		this.hashedPassword = generateHeshedPassword();
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getHashedPassword() {
		return hashedPassword;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getSpecialPointType() {
		return specialPointType;
	}
	
	protected abstract String generateHeshedPassword();
	
	@Override
	public String toString() {
		return String.format("\"%s\" | \"%s\" -> %s", getUsername(), getHashedPassword(), getSpecialPointType());
	}
}
