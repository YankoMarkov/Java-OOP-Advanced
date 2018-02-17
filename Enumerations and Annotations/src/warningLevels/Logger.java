package warningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

	private Importance level;
	private List<Message> messages;
	
	public Logger(Importance level) {
		this.level = level;
		messages = new ArrayList<>();
	}
	
	public Iterable<Message> getMessages() {
		return messages;
	}
	
	public void add(Message message) {
		if (message.getLevel().compareTo(level) >= 0) {
			this.messages.add(message);
		}
	}
}
