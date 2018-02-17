package hell.commands;

import hell.interfaces.Commands;

public class CommandManager implements Commands {
	
	@Override
	public String heroCommand(String name, String type) {
		
		switch (type) {
			case "Assassin":
				
				break;
			case "Barbarian":
				
				break;
			case "Wizard":
				
				break;
		}
		return null;
	}
	
	@Override
	public String itemCommand(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus) {
		return null;
	}
	
	@Override
	public String recipeCommand(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus, String... requiredItem) {
		return null;
	}
	
	@Override
	public String inspectCommand(String name) {
		return null;
	}
	
	@Override
	public String quit() {
		return null;
	}
}
