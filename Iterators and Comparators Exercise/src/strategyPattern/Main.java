package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		Set<Person> orderByName = new TreeSet<>(new PersonNameComparator());
		Set<Person> orderByAge = new TreeSet<>(new PersonAgeComparator());
		
		for (int i = 0; i < num; i++) {
			String[] input = read.readLine().split("\\s+");
			Person person = new Person(input[0], Integer.valueOf(input[1]));
			orderByName.add(person);
			orderByAge.add(person);
		}
		orderByName.forEach(System.out::println);
		orderByAge.forEach(System.out::println);
	}
}
