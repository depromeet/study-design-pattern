package decorator;

public class BorderDecorator extends Decorator {
	private int width;
	
	public BorderDecorator(VisualComponent component, int borderWidth) {
		super(component);
		this.width = borderWidth;
	}
	
	@Override
	public void draw() {
//		component.draw();
		drawBorder(width);
	}
	
	private void drawBorder(int width) {
		System.out.println("Border with " + width + " width");
	}
}
