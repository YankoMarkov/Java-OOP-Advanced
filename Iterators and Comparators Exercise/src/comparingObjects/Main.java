package comparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		List<Person> persons = new LinkedList<>();
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("\\s+");
			String name = input[0];
			int age = Integer.valueOf(input[1]);
			String town = input[2];
			Person person = new Person(name, age, town);
			persons.add(person);
		}
		int index = Integer.valueOf(read.readLine());
		Person toComparePerson = persons.get(index - 1);
		
		int numberOfEqualPeople = 0;
		int numberOfNotEqualPeople = 0;
		int totalNumberOfPeople = persons.size();
		
		for (Person person : persons) {
			if (person.compareTo(toComparePerson) == 0) {
				numberOfEqualPeople++;
			}
			if (person.compareTo(toComparePerson) != 0) {
				numberOfNotEqualPeople++;
			}
		}
		if (numberOfEqualPeople == 1) {
			System.out.println("No matches");
		} else {
			System.out.printf("%d %d %d", numberOfEqualPeople, numberOfNotEqualPeople, totalNumberOfPeople);
		}
	}
}
