package stackIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackIterator<T> implements Iterable<T> {
	
	private LinkedList<T> stack;
	
	public StackIterator() {
		this.stack = new LinkedList<>();
	}
	
	public void push(T element) {
		this.stack.add(element);
	}
	
	public void pop() {
		if (this.stack.isEmpty()) {
			throw new IllegalArgumentException("No elements");
		}
		this.stack.remove(this.stack.size() - 1);
	}
	
	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
			private int index = stack.size() - 1;
			
			@Override
			public boolean hasNext() {
				return this.index >= 0;
			}
			
			@Override
			public T next() {
				if (hasNext()) {
					return stack.get(this.index--);
				}
				throw new NoSuchElementException();
			}
		};
	}
}
