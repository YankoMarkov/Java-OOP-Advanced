package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListyIterator<T> implements Iterator<T> {
	
	private List<T> list;
	private int index;
	
	public ListyIterator(List<T> list) {
		this.list = list;
		this.index = 0;
	}
	
	public List<T> getList() {
		return Collections.unmodifiableList(this.list);
	}
	
	public int getIndex() {
		return index;
	}
	
	public boolean move() {
		if (hasNext()) {
			this.index++;
			return true;
		} else {
			return false;
		}
	}
	
	public String print(){
		if (this.list.isEmpty()) {
			throw new IllegalArgumentException("Invalid Operation!");
		}
		return String.format("%s", list.get(this.getIndex()));
	}
	
	public String printAll() {
		StringBuilder res = new StringBuilder();
		for (T t : list) {
			res.append(t + " ");
		}
		return res.toString();
	}
	
	@Override
	public boolean hasNext() {
		return this.getIndex() < list.size() - 1;
	}
	
	@Override
	public T next() {
		if (hasNext()) {
			return list.get(this.index++);
		}
		throw new NoSuchElementException();
	}
}
