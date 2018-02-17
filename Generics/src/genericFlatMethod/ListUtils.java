package genericFlatMethod;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
	
	public static <T extends Comparable<T>> T getMin(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException();
		}
		T min = list.get(0);
		
		for (T t : list) {
			if (min.compareTo(t) > 0) {
				min = t;
			}
		}
		return min;
	}
	
	public static <T extends Comparable<T>> T getMax(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException();
		}
		T max = list.get(0);
		
		
		for (T t : list) {
			if (max.compareTo(t) < 0) {
				max = t;
			}
		}
		return max;
	}
	
	public static <T> List<Integer> getNullIndices(List<T> list) {
		List<Integer> indexes = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == null) {
				indexes.add(i);
			}
		}
		return indexes;
	}
	
	public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source) {
		for (List<? extends T> list : source) {
			destination.addAll(list);
		}
	}
}
