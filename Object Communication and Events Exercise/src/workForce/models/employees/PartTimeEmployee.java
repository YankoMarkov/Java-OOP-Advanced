package workForce.models.employees;

import workForce.contracts.Employee;

public class PartTimeEmployee implements Employee {
	
	private static final int WORK_HOURS_PER_WEEK = 20;
	private String name;
	
	public PartTimeEmployee(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getWorkHoursPerWeek() {
		return WORK_HOURS_PER_WEEK;
	}
}
