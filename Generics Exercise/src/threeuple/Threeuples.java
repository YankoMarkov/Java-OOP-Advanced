package threeuple;

public class Threeuples<T, U, S> {
	
	private T item1;
	private U item2;
	private S item3;
	
	public Threeuples(T item1, U item2, S item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public T getItem1() {
		return this.item1;
	}
	
	public U getItem2() {
		return this.item2;
	}
	
	public S getItem3() {
		return item3;
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %s -> %s", this.getItem1(), this.getItem2(), this.getItem3());
	}
}
