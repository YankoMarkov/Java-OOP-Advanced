package P04_DetailPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		Employee employee = new Employee("Gosho");
		Employee manager = new Manager("Pesho", "document");
		Employee worker = new Worker("Stoian", 1);
		list.add(employee);
		list.add(manager);
		list.add(worker);
		
		DetailsPrinter detailsPrinter = new DetailsPrinter(list);
		detailsPrinter.printDetails();
	}
}
