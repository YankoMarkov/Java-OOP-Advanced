package infernoInfinity.core;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.weapons.interfaces.Weapon;

import java.util.HashMap;

public class DatabaseImpl implements Database {
	private HashMap<String, Weapon> weapons;
	
	public DatabaseImpl() {
		this.weapons = new HashMap<>();
	}
	
	public void addWeapon(Weapon weapon){
		this.weapons.put(weapon.getName(), weapon);
	}
	
	public Weapon getWeapon(String name){
		if (!weapons.containsKey(name)){
			return null;
		}
		
		return this.weapons.get(name);
	}
}
