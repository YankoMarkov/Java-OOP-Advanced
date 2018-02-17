package customEnumAnnotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String type = read.readLine();
		
		Class<Ranks> ranksClass = Ranks.class;
		Class<Suits> suitsClass = Suits.class;
		
		EnumInfo rankInfo = ranksClass.getAnnotation(EnumInfo.class);
		EnumInfo suitInfo = suitsClass.getAnnotation(EnumInfo.class);
		
		if (type.equals("Rank")) {
			System.out.printf("Type = %s, Description = %s%n", rankInfo.type(), rankInfo.description());
		} else {
			System.out.printf("Type = %s, Description = %s%n", suitInfo.type(), suitInfo.description());
		}
	}
}
