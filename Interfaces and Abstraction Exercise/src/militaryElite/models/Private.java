package militaryElite.models;

import militaryElite.interfaces.IPrivate;

public class Private extends Soldier implements IPrivate {

	private double salary;
	
	public Private(String id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName);
		this.salary = salary;
	}
	
	@Override
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %s Salary: %.2f%n", getFirstName(), getLastName(), getId(), getSalary());
	}
}
