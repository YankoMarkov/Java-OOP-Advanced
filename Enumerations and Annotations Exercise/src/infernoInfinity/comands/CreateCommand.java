package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.enums.WeaponType;
import infernoInfinity.weapons.Axe;
import infernoInfinity.weapons.Knife;
import infernoInfinity.weapons.Sword;
import infernoInfinity.weapons.interfaces.Weapon;

public class CreateCommand extends Command{
	
	public CreateCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		String[] input = this.getParams();
		WeaponType type = WeaponType.valueOf(input[1]);
		String name = input[2];
		Weapon weapon;
		switch (type){
			case AXE:
				weapon = new Axe(name);
				break;
			
			case SWORD:
				weapon = new Sword(name);
				break;
			
			case KNIFE:
				weapon = new Knife(name);
				break;
			
			default:
				return null;
		}
		
		this.getDatabase().addWeapon(weapon);
		return null;
	}
}
