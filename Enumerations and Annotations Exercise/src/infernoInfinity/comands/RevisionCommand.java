package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.weapons.WeaponImpl;
import infernoInfinity.weapons.WeaponInfo;

public class RevisionCommand extends Command{
	public RevisionCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		int revision = WeaponImpl.class.getAnnotation(WeaponInfo.class).revision();
		return String.format("Revision: %d", revision);
	}
}
