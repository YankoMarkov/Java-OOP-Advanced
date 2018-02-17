package collectionHierarchy.models;

import collectionHierarchy.interfaces.Addable;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddCollection implements Addable {
	
	private Deque<String> list;
	
	public AddCollection() {
		this.list = new ArrayDeque<>();
	}
	
	@Override
	public int add(String str) {
		this.list.addLast(str);
		return list.size() - 1;
	}
}
