package jarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> {
	
	private Deque<E> element;
	
	public Jar() {
		element = new ArrayDeque<>();
	}
	
	public void add(E element) {
		this.element.push(element);
	}
	
	public E remove() {
		return this.element.pop();
	}
}
