package customList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		CustomList box = new CustomList();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("END")) {
			String[] input = inputs.split("\\s+");
			
			switch (input[0]) {
				case "Add":
					String element = input[1];
					box.add(element);
					break;
				case "Remove":
					int index = Integer.valueOf(input[1]);
					box.remove(index);
					break;
				case "Contains":
					element = input[1];
					if (box.contains(element)) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
					break;
				case "Swap":
					int index1 = Integer.valueOf(input[1]);
					int index2 = Integer.valueOf(input[2]);
					box.swap(index1, index2);
					break;
				case "Greater":
					element = input[1];
					System.out.println(box.countGreaterThan(element));
					break;
				case "Max":
					System.out.println(box.getMax());
					break;
				case "Min":
					System.out.println(box.getMin());
					break;
				case "Print":
					for (Object o : box.getList()) {
						System.out.println(o);
					}
					break;
			}
		}
	}
}
