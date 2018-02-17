package models.loggers;

import enums.LogType;

public class EventLogger extends Logger {
	
	@Override
	public void handle(LogType type, String message) {
		
		if (type == LogType.EVENT) {
			System.out.println(type.name() + ": " + message);
		} else {
			this.passToSuccessor(type, message);
		}
	}
}
