package coffeeMachine;

public class Coffee {
	
	private CoffeeSize size;
	private CoffeeType type;
	
	public Coffee(CoffeeSize size, CoffeeType type) {
		this.size = size;
		this.type = type;
	}
	
	public int getPrice() {
		return this.size.getPrice();
	}
	
	public CoffeeSize getSize() {
		return size;
	}
	
	public CoffeeType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", getSize(), getType());
	}
}
