package collectionHierarchy.models;

import collectionHierarchy.interfaces.Addable;
import collectionHierarchy.interfaces.Removable;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddRemoveCollection implements Addable, Removable {
	
	private Deque<String> list;
	
	public AddRemoveCollection() {
		this.list = new ArrayDeque<>();
	}
	
	@Override
	public int add(String str) {
		this.list.addFirst(str);
		return 0;
	}
	
	@Override
	public String remove() {
		return this.list.removeLast();
	}
}
