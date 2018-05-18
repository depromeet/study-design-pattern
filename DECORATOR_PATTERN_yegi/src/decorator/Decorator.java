package decorator;

public abstract class Decorator implements VisualComponent{
	private VisualComponent component;
	
	public Decorator(VisualComponent component) {
		this.component = component;
	}
	
	public void draw() {
		component.draw();
	}
}
