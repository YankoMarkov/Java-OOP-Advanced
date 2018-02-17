package militaryElite.models;

import militaryElite.interfaces.ISpy;

public class Spy extends Soldier implements ISpy {
	
	private int codeNumber;
	
	public Spy(String id, String firstName, String lastName, int codeNumber) {
		super(id, firstName, lastName);
		this.codeNumber = codeNumber;
	}
	
	@Override
	public int getCodeNumber() {
		return this.codeNumber;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %s%n" +
				"Code Number: %d%n", getFirstName(), getLastName(), getId(), getCodeNumber());
	}
}
