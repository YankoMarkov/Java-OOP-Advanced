package models.loggers;

import enums.LogType;

public class TargetLogger extends Logger {
	
	@Override
	public void handle(LogType type, String message) {
		if (type == LogType.TARGET) {
			System.out.println(type.name() + ": " + message);
		} else {
			this.passToSuccessor(type, message);
		}
	}
}
