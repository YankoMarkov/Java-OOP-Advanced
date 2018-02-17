package collectionHierarchy.models;

import collectionHierarchy.interfaces.Addable;
import collectionHierarchy.interfaces.Removable;
import collectionHierarchy.interfaces.Usedable;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyList implements Addable, Removable, Usedable {
	
	private Deque<String> list;
	
	public MyList() {
		this.list = new ArrayDeque<>();
	}
	
	@Override
	public int add(String str) {
		this.list.addFirst(str);
		return 0;
	}
	
	@Override
	public String remove() {
		return this.list.removeFirst();
	}
	
	@Override
	public int used() {
		return this.list.size();
	}
}
