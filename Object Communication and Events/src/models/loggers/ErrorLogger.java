package models.loggers;

import enums.LogType;

public class ErrorLogger extends Logger {
	
	@Override
	public void handle(LogType type, String message) {
		if (type == LogType.ERROR) {
			System.out.println(type.name() + ": " + message);
		} else {
			this.passToSuccessor(type, message);
		}
	}
}
