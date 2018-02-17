package militaryElite.models;

import militaryElite.interfaces.IEngineer;
import militaryElite.interfaces.IRepair;
import militaryElite.interfaces.ISpecialisedSoldier;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Engineer extends Private implements IEngineer, ISpecialisedSoldier {

	private String corps;
	private List<IRepair> repairs;
	
	public Engineer(String id, String firstName, String lastName, double salary, String corps) {
		super(id, firstName, lastName, salary);
		this.setCorps(corps);
		this.repairs = new LinkedList<>();
	}
	
	@Override
	public List<IRepair> getRepairs() {
		return Collections.unmodifiableList(this.repairs);
	}
	
	@Override
	public void addRepair(IRepair repair) {
		this.repairs.add(repair);
	}
	
	@Override
	public String getCorps() {
		return this.corps;
	}
	
	private void setCorps(String corps) {
		if (!corps.equalsIgnoreCase("AirForces") && !corps.equalsIgnoreCase("Marines")) {
			throw new IllegalArgumentException();
		}
		this.corps = corps;
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Name: %s %s Id: %s Salary: %.2f%n", getFirstName(), getLastName(), getId(), getSalary()));
		res.append(String.format("Corps: %s%n", getCorps()));
		res.append("Repairs:").append("\n");
		for (IRepair repair : repairs) {
			res.append(" ").append(repair.toString());
		}
		return res.toString();
	}
}
