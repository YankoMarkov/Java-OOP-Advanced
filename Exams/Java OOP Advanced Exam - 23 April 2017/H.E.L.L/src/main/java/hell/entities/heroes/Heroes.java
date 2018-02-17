package hell.entities.heroes;

import hell.entities.annotations.ItemCollection;
import hell.interfaces.Hero;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Heroes implements Hero {
	
	private String name;
	private int strength;
	private int agility;
	private int intelligence;
	private int hitPoints;
	private int damage;
	private Inventory inventory;
	
	protected Heroes(String name, int strength, int agilioty, int intelligence, int hitPoints, int damage, Inventory inventory) {
		this.name = name;
		this.strength = strength;
		this.agility = agilioty;
		this.intelligence = intelligence;
		this.hitPoints = hitPoints;
		this.damage = damage;
		this.inventory = inventory;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public long getStrength() {
		return this.strength;
	}
	
	@Override
	public long getAgility() {
		return this.agility;
	}
	
	@Override
	public long getIntelligence() {
		return this.intelligence;
	}
	
	@Override
	public long getHitPoints() {
		return this.hitPoints;
	}
	
	@Override
	public long getDamage() {
		return this.damage;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Collection<Item> getItems() throws IllegalAccessException {
		Map<String, Item> commonItems = new LinkedHashMap<>();
		Field[] heroInventoryfields = this.inventory.getClass().getDeclaredFields();
		
		for (int i = 0; i < heroInventoryfields.length; i++) {
			for (Field heroInventoryfield : heroInventoryfields) {
				if (heroInventoryfield.isAnnotationPresent(ItemCollection.class)) {
					heroInventoryfield.setAccessible(true);
					commonItems = (Map<String, Item>) heroInventoryfield.get(this.inventory);
				}
			}
		}
		return new ArrayList<>(commonItems.values());
	}
	
	@Override
	public void addItem(Item item) {
		this.inventory.addCommonItem(item);
	}
	
	@Override
	public void addRecipe(Recipe recipe) {
		this.inventory.addRecipeItem(recipe);
	}
}
