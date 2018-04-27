
public class DigitalClock extends Object.Observer {
	public ClockTimer subject;
	
	public DigitalClock(ClockTimer s) {
		this.subject = s;
		this.subject.Attach(this);
	}
	
	public void Remove() {
		this.subject.Detach(this);
	}
	
	@Override
	public void Update(Object.Subject changedSubject) {
		if (changedSubject == this.subject) {
			Draw();
		}
	}
	
	public void Draw() {
		int hour = this.subject.GetHour();
		int minute = this.subject.GetMinute();
		int second = this.subject.GetSecond();
		
		System.out.println("***Digital Clock***");
		System.out.println(hour+":"+minute+":"+second+":");
	}
}
