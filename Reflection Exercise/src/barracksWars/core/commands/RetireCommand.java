package barracksWars.core.commands;

import barracksWars.interfaces.Inject;
import barracksWars.interfaces.Repository;

public class RetireCommand extends Command{
	
	@Inject
	private Repository repository;
	
	public RetireCommand(String[] data) {
		super(data);
	}
	
	@Override
	public String execute() {
		String unitType = getData()[1];
		try {
			this.repository.removeUnit(unitType);
		} catch (IllegalArgumentException ex){
			return ex.getMessage();
		}
		
		return unitType + " retired!";
	}
}
