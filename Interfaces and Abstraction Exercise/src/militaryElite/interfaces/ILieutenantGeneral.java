package militaryElite.interfaces;

import militaryElite.models.Private;

import java.util.List;

public interface ILieutenantGeneral {
	
	List<ISoldier> getPrivates();
	void addPrivate(ISoldier solder);
}
