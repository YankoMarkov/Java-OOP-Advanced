package infernoInfinity.core.interfaces;

import infernoInfinity.weapons.interfaces.Weapon;

public interface Database {
	void addWeapon(Weapon weapon);
	Weapon getWeapon(String name);
}
