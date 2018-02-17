package ferrari;

class Ferrari implements Car {
	
	private static final String MODEL = "488-Spider";
	private String name;
	
	public Ferrari(String name) {
		this.name = name;
	}
	
	public static String getMODEL() {
		return MODEL;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String pushBreaks() {
		return "Brakes!";
	}
	
	@Override
	public String pushGas() {
		return "Zadu6avam sA!";
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%s%n", getMODEL(), pushBreaks(), pushGas(), getName());
	}
}
