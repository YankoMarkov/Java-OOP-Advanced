package foodShortage;

class Citizen implements Person, Identifiable, Birthable, Buyer {
	
	private String name;
	private int age;
	private String id;
	private String birthdate;
	private int food;
	
	public Citizen(String name, int age, String id, String birthdate) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.birthdate = birthdate;
		this.food = 0;
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
	public String birthdate() {
		return this.birthdate;
	}
	
	@Override
	public String id() {
		return this.id;
	}
	
	@Override
	public int buyFood() {
		return this.food += 10;
	}
	
	@Override
	public int getFood() {
		return this.food;
	}
}
