package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		ListyIterator listyIterator = null;
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("\\s+");
			
			try {
				switch (input[0].toLowerCase()) {
					case "create":
						List<String> list = Arrays.stream(input).skip(1).collect(Collectors.toList());
						listyIterator = new ListyIterator(list);
						break;
					case "move":
						System.out.println(listyIterator.move());
						break;
					case "print":
						System.out.println(listyIterator.print());
						break;
					case "hasnext":
						System.out.println(listyIterator.hasNext());
						break;
					case "printall":
						System.out.println(listyIterator.printAll());
						break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
