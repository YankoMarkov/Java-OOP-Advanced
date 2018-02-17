package infernoInfinity.comands;

import infernoInfinity.comands.interfaces.Executable;
import infernoInfinity.core.interfaces.Database;

public abstract class Command implements Executable {
	private Database database;
	private String[] params;
	
	protected Command(Database database, String[] params) {
		this.database = database;
		this.params = params;
	}
	
	protected Database getDatabase() {
		return database;
	}
	
	protected String[] getParams() {
		return params;
	}
	
	public abstract String execute();
}
