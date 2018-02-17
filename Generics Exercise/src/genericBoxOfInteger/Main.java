package genericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(read.readLine());
		
		for (int i = 0; i < num; i++) {
			int number = Integer.valueOf(read.readLine());
			Box box = new Box(Integer.class, number);
			System.out.println(box);
		}
	}
}
