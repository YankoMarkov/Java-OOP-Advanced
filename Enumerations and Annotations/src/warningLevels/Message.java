package warningLevels;

public class Message {
	
	private Importance level;
	private String message;
	
	public Message(Importance level, String message) {
		this.level = level;
		this.message = message;
	}
	
	public Importance getLevel() {
		return level;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s", getLevel(), getMessage());
	}
}
