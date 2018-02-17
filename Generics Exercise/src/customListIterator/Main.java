package customListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		CustomList list = new CustomList();
		String inputs;
		
		while (!(inputs = read.readLine()).equals("END")) {
			String[] input = inputs.split("\\s+");
			
			switch (input[0]) {
				case "Add":
					String element = input[1];
					list.add(element);
					break;
				case "Remove":
					int index = Integer.valueOf(input[1]);
					list.remove(index);
					break;
				case "Contains":
					element = input[1];
					if (list.contains(element)) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
					break;
				case "Swap":
					int index1 = Integer.valueOf(input[1]);
					int index2 = Integer.valueOf(input[2]);
					list.swap(index1, index2);
					break;
				case "Greater":
					element = input[1];
					System.out.println(list.countGreaterThan(element));
					break;
				case "Max":
					System.out.println(list.getMax());
					break;
				case "Min":
					System.out.println(list.getMin());
					break;
				case "Sort":
					list.sort();
					break;
				case "Print":
					System.out.println(list.toString().trim());
					break;
				
			}
		}
	}
}
