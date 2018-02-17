package P03_GraphicEditor;

public class Main {
	
	public static void main(String[] args) {
		
		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle();
		
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.draw(shape1);
		graphicEditor.draw(shape2);
	}
}