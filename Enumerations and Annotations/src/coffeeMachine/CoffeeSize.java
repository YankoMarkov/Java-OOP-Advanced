package coffeeMachine;

public enum CoffeeSize {

	SMALL("Small", 50, 50),
	NORMAL("Normal", 100, 75),
	DOUBLE("Double", 200, 100);
	
	private String size;
	private int dosage;
	private int price;
	
	CoffeeSize(String type, int dosage, int price) {
		this.size = type;
		this.dosage = dosage;
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getDosage() {
		return dosage;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return getSize();
	}
}
