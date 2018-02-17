package infernoInfinity.weapons.interfaces;

import infernoInfinity.gems.interfaces.Gem;

public interface Weapon extends Comparable<Weapon> {
	
	void addGem(Gem gem, int index);
	void remove(int index);
	String getName();
	double calculateLevel();
}
