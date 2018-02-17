package coffeeMachine;

public enum CoffeeType {

	ESPRESSO("Espresso"),
	LATTE("Late"),
	IRISH("Irish");
	
	private String type;
	
	CoffeeType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return getType();
	}
}
