import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Object {
	public static abstract class Subject {
		public List<Observer> observers = new ArrayList<Observer>();
		
		public Subject() {}
		
		public void Attach(Observer observer) {
			this.observers.add(observer);
		}
		public void Detach(Observer observer) {
			this.observers.remove(observer);
		}
		public void Notify() {
			Iterator<Observer> iterator = observers.iterator();
			while (iterator.hasNext()) {
				iterator.next().Update(this);
			}
		}
	}
	
	public static abstract class Observer {
		public Observer() {}
		
		public void Update(Subject chagnedSubject) {};
	}
}
