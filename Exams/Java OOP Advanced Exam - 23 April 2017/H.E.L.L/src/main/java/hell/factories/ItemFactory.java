package hell.factories;

import hell.entities.items.CommonItem;
import hell.interfaces.Item;

public final class ItemFactory {
	
	private ItemFactory() {
	}
	
	public static Item createCommonItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus) {
		return new CommonItem(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
	}
	
	public static Item createRecipeItem(String name, int strengthBonus, int agilityBonus, int intelligenceBonus, int hitPointsBonus, int damageBonus) {
		return new CommonItem(name, strengthBonus, agilityBonus, intelligenceBonus, hitPointsBonus, damageBonus);
	}
}