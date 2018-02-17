package genericCountMethodDoubles;

import java.util.Collections;
import java.util.List;

public class Box<T extends Comparable<T>> {
	
	private List<T> list;
	private int count;
	
	public Box(List<T> list) {
		this.list = list;
		this.count = 0;
	}
	
	public List<T> getList() {
		return Collections.unmodifiableList(this.list);
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(T type) {
		int count = 0;
		for (T t : getList()) {
			if (t.compareTo(type) > 0) {
				count++;
			}
		}
		this.count = count;
	}
}
