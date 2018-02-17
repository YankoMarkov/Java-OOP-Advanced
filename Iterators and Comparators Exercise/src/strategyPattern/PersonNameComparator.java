package strategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
	
	@Override
	public int compare(Person firstPerson, Person secondPerson) {
		int result = Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());
		if (result != 0) {
			return result;
		}
		char first = Character.toLowerCase(firstPerson.getName().charAt(0));
		char second = Character.toLowerCase(secondPerson.getName().charAt(0));
		return Character.compare(first, second);
	}
}
