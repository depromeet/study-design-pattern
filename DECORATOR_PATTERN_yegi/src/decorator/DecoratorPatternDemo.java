package decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		VisualComponent text = new textView();
		
		VisualComponent borderText1 = new BorderDecorator(new textView(), 1);
		
		VisualComponent borderText2 = new BorderDecorator(new textView(), 2);
		
		text.draw();
		borderText1.draw();
		borderText2.draw();
	}
}
