package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.enums.GemType;
import infernoInfinity.gems.Amethyst;
import infernoInfinity.gems.Emerald;
import infernoInfinity.gems.Ruby;
import infernoInfinity.gems.interfaces.Gem;
import infernoInfinity.weapons.interfaces.Weapon;

public class AddCommand extends Command{
	public AddCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		String[] input = this.getParams();
		String name = input[1];
		Weapon weapon = this.getDatabase().getWeapon(name);
		if (weapon == null){
			return null;
		}
		
		int index = Integer.valueOf(input[2]);
		GemType gemType = GemType.valueOf(input[3]);
		Gem gem;
		switch (gemType){
			case RUBY:
				gem = new Ruby();
				break;
			
			case EMERALD:
				gem = new Emerald();
				break;
			
			case AMETHYST:
				gem = new Amethyst();
				break;
			
			default:
				return null;
		}
		weapon.addGem(gem, index);
		return null;
	}
}
