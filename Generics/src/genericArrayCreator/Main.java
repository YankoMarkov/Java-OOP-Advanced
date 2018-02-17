package genericArrayCreator;

public class Main {
	
	public static void main(String[] args) {
	
		String[] string = ArrayCreator.create(10, "none");
		Integer[] integer = ArrayCreator.create(Integer.class, 10, 0);
	}
}
