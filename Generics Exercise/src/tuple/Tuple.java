package tuple;

public class Tuple<T, U> {
	
	private T item1;
	private U item2;
	
	public Tuple(T item1, U item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return this.item1;
	}
	
	public U getItem2() {
		return this.item2;
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %s", this.getItem1(), this.getItem2());
	}
}
