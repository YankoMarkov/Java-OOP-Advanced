package hell.interfaces;

public interface Commands {
	
	String heroCommand(String name, String type);
	
	String itemCommand(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus);
	
	String recipeCommand(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus, String... requiredItem);
	
	String inspectCommand(String name);
	
	String quit();
}
