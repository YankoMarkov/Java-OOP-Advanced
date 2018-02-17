package militaryElite.interfaces;

import militaryElite.models.Repair;

import java.util.List;

public interface IEngineer {
	
	List<IRepair> getRepairs();
	void addRepair(IRepair repair);
}
