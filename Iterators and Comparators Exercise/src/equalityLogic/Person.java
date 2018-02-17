package equalityLogic;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		Person person = (Person) object;
		if (this.getAge() != person.getAge()) {
			return false;
		}
		return this.getName() != null ? this.getName().equals(person.getName()) : person.name == null;
	}
	
	@Override
	public int hashCode() {
		int result = this.name != null ? this.name.hashCode() : 0;
		result = 31 * result + this.age;
		return result;
	}
	
	@Override
	public int compareTo(Person person) {
		return Integer.compare(this.hashCode(), person.hashCode());
	}
}
