package genericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		List<String> input = new LinkedList<>();
		
		for (int i = 0; i < num; i++) {
			String str = read.readLine();
			input.add(str);
		}
		
		int[] command = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
		input = Box.swap(input, command);
		Box box = new Box(String.class, input);
		System.out.println(box.toString().trim());
	}
}
