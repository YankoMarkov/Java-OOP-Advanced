package harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Class testClass = RichSoilLand.class;
		String input;
		
		while (!(input = read.readLine()).equalsIgnoreCase("harvest")) {
			Field[] fields = testClass.getDeclaredFields();
			
			switch (input) {
				case "private":
					for (Field field : fields) {
						if (Modifier.isPrivate(field.getModifiers())) {
							int modifire = field.getModifiers();
							System.out.printf("%s %s %s%n", Modifier.toString(modifire), field.getType().getSimpleName(), field.getName());
						}
					}
					break;
				case "protected":
					for (Field field : fields) {
						if (Modifier.isProtected(field.getModifiers())) {
							int modifire = field.getModifiers();
							System.out.printf("%s %s %s%n", Modifier.toString(modifire), field.getType().getSimpleName(), field.getName());
						}
					}
					break;
				case "public":
					for (Field field : fields) {
						if (Modifier.isPublic(field.getModifiers())) {
							int modifire = field.getModifiers();
							System.out.printf("%s %s %s%n", Modifier.toString(modifire), field.getType().getSimpleName(), field.getName());
						}
					}
					break;
				case "all":
					for (Field field : fields) {
						int modifire = field.getModifiers();
						System.out.printf("%s %s %s%n", Modifier.toString(modifire), field.getType().getSimpleName(), field.getName());
					}
					break;
			}
		}
	}
}
