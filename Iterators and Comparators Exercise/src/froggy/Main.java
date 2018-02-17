package froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> input = Arrays.stream(read.readLine().split("[,\\s]+")).map(Integer::valueOf).collect(Collectors.toList());
		
		Lake lake = new Lake(input);
		StringBuilder res = new StringBuilder();
		
		for (Integer integer : lake) {
			res.append(integer + ", ");
		}
		res.setLength(res.length() - 2);
		System.out.println(res);
	}
}
