package decorator;

public class textView implements VisualComponent {
	
	@Override
	public void draw() {
		System.out.println("Visual Component: Text");
	}
}
