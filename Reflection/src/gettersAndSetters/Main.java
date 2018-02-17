package gettersAndSetters;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		Class reflectionClass = Reflection.class;
		Method[] reflectionMethods = reflectionClass.getDeclaredMethods();
		
		Method[] getters = Arrays.stream(reflectionMethods)
				.filter(a -> a.getName().startsWith("get"))
				.toArray(Method[]::new);
		
		Arrays.sort(getters, Comparator.comparing(Method::getName));
		
		Method[] setters = Arrays.stream(reflectionMethods)
				.filter(a -> a.getName().startsWith("set"))
				.toArray(Method[]::new);
		
		Arrays.sort(setters, Comparator.comparing(Method::getName));
		
		for (Method getter : getters) {
			System.out.printf("%s will return %s%n", getter.getName(), getter.getReturnType());
		}
		
		for (Method setter : setters) {
			if (void.class.equals(setter.getReturnType())) {
				if (setter.getParameterCount() == 1) {
					System.out.printf("%s and will set field of %s%n", setter.getName(), setter.getParameterTypes()[0]);
				}
			}
		}
	}
}
