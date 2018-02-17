package blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, NoSuchFieldException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Class testClass = BlackBoxInt.class;
		Constructor constructor = testClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		BlackBoxInt blackBoxInt = (BlackBoxInt) constructor.newInstance();
		
		String inputs;
		
		while (!(inputs = read.readLine()).equalsIgnoreCase("end")) {
			String[] input = inputs.split("_");
			
			Method method = testClass.getDeclaredMethod(input[0], int.class);
			method.setAccessible(true);
			method.invoke(blackBoxInt, Integer.valueOf(input[1]));
			Field field = testClass.getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(blackBoxInt));
		}
	}
}
