package militaryElite.models;

import militaryElite.interfaces.ICommando;
import militaryElite.interfaces.IMission;
import militaryElite.interfaces.ISpecialisedSoldier;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Commando extends Private implements ICommando, ISpecialisedSoldier {
	
	private String corps;
	private List<IMission> missions;
	
	public Commando(String id, String firstName, String lastName, double salary, String corps) {
		super(id, firstName, lastName, salary);
		this.setCorps(corps);
		this.missions = new LinkedList<>();
	}
	
	@Override
	public List<IMission> getMissions() {
		return Collections.unmodifiableList(this.missions);
	}
	
	@Override
	public void addMission(IMission mission) {
		this.missions.add(mission);
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
		res.append("Missions:").append("\n");
		for (IMission mission : missions) {
			res.append(" ").append(mission.toString());
		}
		return res.toString();
	}
}
