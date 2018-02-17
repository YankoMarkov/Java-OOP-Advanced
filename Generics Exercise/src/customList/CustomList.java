package customList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
	
	private List<T> list;
	
	public CustomList() {
		this.list = new LinkedList<>();
	}
	
	public List<T> getList() {
		return Collections.unmodifiableList(this.list);
	}
	
	public void add(T element) {
		this.list.add(element);
	}
	
	public void remove(int index) {
		this.list.remove(index);
	}
	
	public boolean contains(T element) {
		return this.list.contains(element);
	}
	
	public void swap(int index1, int index2) {
		T temp = this.list.get(index2);
		this.list.set(index2, list.get(index1));
		this.list.set(index1, temp);
	}
	
	public int countGreaterThan(T element) {
		int count = 0;
		for (T t : getList()) {
			if (t.compareTo(element) > 0) {
				count++;
			}
		}
		return count;
	}
	
	public T getMax() {
		T temp = this.list.get(0);
		for (T t : list) {
			if (t.compareTo(temp) > 0) {
				temp = t;
			}
		}
		return temp;
	}
	
	public T getMin() {
		T temp = this.list.get(0);
		for (T t : list) {
			if (t.compareTo(temp) < 0) {
				temp = t;
			}
		}
		return temp;
	}
}
