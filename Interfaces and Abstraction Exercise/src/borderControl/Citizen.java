package borderControl;

class Citizen implements Person, Identifiable {
	
	private String name;
	private int age;
	private String id;
	
	public Citizen(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String getId() {
		return this.id;
	}
}
