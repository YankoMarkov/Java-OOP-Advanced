package P04_DetailPrinter;

public class Worker extends Employee {
	
	private int id;
	
	public Worker(String name, int id) {
		super(name);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("%s Id: %s", super.toString(), id);
	}
}
