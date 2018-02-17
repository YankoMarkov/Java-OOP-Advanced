package genericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<Double> input = new LinkedList<>();
		
		for (int i = 0; i < num; i++) {
			Double number = Double.valueOf(read.readLine());
			input.add(number);
		}
		
		double element = Double.valueOf(read.readLine());
		Box box = new Box(input);
		box.setCount(element);
		System.out.println(box.getCount());
	}
}
