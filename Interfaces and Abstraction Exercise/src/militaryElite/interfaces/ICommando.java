package militaryElite.interfaces;

import militaryElite.models.Mission;

import java.util.List;

public interface ICommando {
	
	List<IMission> getMissions();
	void addMission(IMission mission);
}
