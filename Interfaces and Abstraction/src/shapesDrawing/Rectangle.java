package shapesDrawing;

public class Rectangle implements Drawable {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		drawLine(this.width, '*', '*');
		for (int i = 1; i < this.height - 1; ++i)
			drawLine(this.width, '*', ' ');
		drawLine(this.width, '*', '*');
	}
	
	private void drawLine(int width, char c, char c1) {
		System.out.print(c);
		for (int i = 1; i < width - 1; ++i)
			System.out.print(c1);
		System.out.println(c);
	}
}
