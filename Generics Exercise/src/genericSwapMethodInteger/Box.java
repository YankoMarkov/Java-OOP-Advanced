package genericSwapMethodInteger;

import java.util.Collections;
import java.util.List;

public class Box<T> {
	
	private Class<T> classType;
	private List<T> type;
	
	public Box(Class<T> classType, List<T> type) {
		this.classType = classType;
		this.type = type;
	}
	
	public List<T> getType() {
		return Collections.unmodifiableList(this.type);
	}
	
	public Class<T> getClassType() {
		return classType;
	}
	
	public static <T> List<T> swap(List<T> list, int[] indexes) {
		int firstIndex = indexes[0];
		int secondIndex = indexes[1];
		T temp = list.get(secondIndex);
		list.set(secondIndex, list.get(firstIndex));
		list.set(firstIndex, temp);
		return list;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (T t : getType()) {
			result.append(String.format("%s: %s%n", getClassType().getName(), t));
		}
		return result.toString();
	}
}
