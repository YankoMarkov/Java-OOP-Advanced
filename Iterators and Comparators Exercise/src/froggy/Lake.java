package froggy;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Lake implements Iterable<Integer> {
	
	private List<Integer> list;
	
	public Lake(List<Integer> list) {
		this.list = list;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Frog();
	}
	
	private class Frog implements Iterator<Integer> {
		
		private int evenIndex;
		private int oddIndex;
		
		public Frog() {
			this.evenIndex = 0;
			this.oddIndex = 1;
		}
		
		private int getEvenIndex() {
			return evenIndex;
		}
		
		public int getOddIndex() {
			return oddIndex;
		}
		
		@Override
		public boolean hasNext() {
			return (this.getEvenIndex() < list.size()) || (this.getOddIndex() < list.size());
		}
		
		@Override
		public Integer next() {
			if (hasNext()) {
				if (this.getEvenIndex() < list.size()) {
					int current = list.get(this.getEvenIndex());
					this.evenIndex += 2;
					return current;
				} else if (this.getOddIndex() < list.size()){
					int current = list.get(this.getOddIndex());
					this.oddIndex += 2;
					return current;
				}
			}
			throw new NoSuchElementException();
		}
	}
}
