package models.loggers;

import enums.LogType;
import interfaces.Handler;

public abstract class Logger implements Handler {
	
	private Handler successor;
	
	protected void passToSuccessor(LogType type, String message) {
		if (this.successor != null) {
			this.successor.handle(type, message);
		}
	}
	
	@Override
	public abstract void handle(LogType type, String message);
	
	@Override
	public void setSuccessor(Handler handler) {
		this.successor = handler;
	}
}
