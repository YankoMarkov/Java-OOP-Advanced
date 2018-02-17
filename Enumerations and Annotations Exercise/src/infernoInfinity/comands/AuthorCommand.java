package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.weapons.WeaponImpl;
import infernoInfinity.weapons.WeaponInfo;

public class AuthorCommand extends Command{
	public AuthorCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		String author = WeaponImpl.class.getAnnotation(WeaponInfo.class).author();
		return String.format("Author: %s", author);
	}
}
