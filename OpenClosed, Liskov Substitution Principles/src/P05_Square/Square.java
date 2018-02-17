package P05_Square;

public class Square extends Rectangle {
	
	public Square(int m_width, int m_height) {
		this.validate(m_width, m_width);
		super.setWidth(m_width);
		super.setHeight(m_height);
	}
	
	public Square(int side) {
		super(side, side);
	}
	
	private void validate(int wide, int hide) {
		if (wide != hide) {
			throw new IllegalArgumentException("Square cannot be with different sides.");
		}
	}
}
