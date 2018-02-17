package militaryElite.models;

import militaryElite.interfaces.ILieutenantGeneral;
import militaryElite.interfaces.ISoldier;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LeutenantGeneral extends Private implements ILieutenantGeneral {

	private List<ISoldier> privates;
	
	public LeutenantGeneral(String id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
		this.privates = new LinkedList<>();
	}
	
	@Override
	public List<ISoldier> getPrivates() {
		return Collections.unmodifiableList(this.privates);
	}
	
	@Override
	public void addPrivate(ISoldier solder) {
		this.privates.add(solder);
	}
	
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Name: %s %s Id: %s Salary: %.2f%n", getFirstName(), getLastName(), getId(), getSalary()));
		res.append("Privates:").append("\n");
		for (ISoldier solder : privates) {
			res.append(" ").append(solder.toString());
		}
		return res.toString();
	}
}
