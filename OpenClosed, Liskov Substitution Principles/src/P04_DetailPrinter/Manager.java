package P04_DetailPrinter;

import java.util.Arrays;

public class Manager extends Employee {
	
	private String[] documents;
	
	public Manager(String name, String... documents) {
		super(name);
		this.documents = documents;
	}
	
	@Override
	public String toString() {
		return String.format("%s Doks: %s", super.toString(), Arrays.toString(documents));
	}
}
