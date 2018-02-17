package P01_ExtendedArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ExtendedArrayList<Integer> number = new ExtendedArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		System.out.println(number.max());
		System.out.println(number.min());
	}
}
