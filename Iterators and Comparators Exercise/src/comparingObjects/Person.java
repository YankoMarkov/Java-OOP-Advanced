package comparingObjects;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	private String town;
	
	public Person(String name, int age, String town) {
		this.name = name;
		this.age = age;
		this.town = town;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getTown() {
		return town;
	}
	
	@Override
	public int compareTo(Person person) {
		int compare = this.getName().compareTo(person.getName());
		if (compare == 0) {
			compare = Integer.compare(this.getAge(), person.getAge());
		}
		if (compare == 0) {
			compare = this.getTown().compareTo(person.getTown());
		}
		return compare;
	}
}
