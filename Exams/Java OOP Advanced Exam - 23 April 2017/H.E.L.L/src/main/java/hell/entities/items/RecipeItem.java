package hell.entities.items;

import hell.interfaces.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeItem extends Items implements Recipe {
	
	private List<String> requiredItems;
	
	public RecipeItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus) {
		super(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
		this.requiredItems = new ArrayList<>();
	}
	
	@Override
	public List<String> getRequiredItems() {
		return this.requiredItems;
	}
}
