package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.weapons.WeaponImpl;
import infernoInfinity.weapons.WeaponInfo;

public class DescriptionCommand extends Command {
	public DescriptionCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		String description = WeaponImpl.class.getAnnotation(WeaponInfo.class).description();
		return String.format("Class description: %s", description);
	}
}
