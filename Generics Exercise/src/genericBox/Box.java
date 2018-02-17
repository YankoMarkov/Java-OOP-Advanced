package genericBox;

public class Box<T> {
	
	private Class<T> classType;
	private T type;
	
	public Box(Class<T> classType, T type) {
		this.classType = classType;
		this.type = type;
	}
	
	public T getType() {
		return type;
	}
	
	public Class<T> getClassType() {
		return classType;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s", getClassType().getName(), getType());
	}
}
