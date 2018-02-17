package infernoInfinity.comands;

import infernoInfinity.core.interfaces.Database;
import infernoInfinity.weapons.WeaponImpl;
import infernoInfinity.weapons.WeaponInfo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReviewersCommand extends Command{
	public ReviewersCommand(Database database, String[] params) {
		super(database, params);
	}
	
	@Override
	public String execute() {
		String[] reviewers = WeaponImpl.class.getAnnotation(WeaponInfo.class).reviewers();
		return String.format("Reviewers: %s", Arrays.stream(reviewers).collect(Collectors.joining(", ")));
	}
}
