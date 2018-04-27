
public class ClockTimer extends Object.Subject {
	private int Hour = 0;   // 24hours = 1 Day
	private int Minute = 0; 
	private int Second = 0;
	
	public ClockTimer() {}
	
	public int GetHour() {
		return this.Hour;
	}
	
	public int GetMinute() {
		return this.Minute;
	}
	
	public int GetSecond() {
		return this.Second;
	}
	
	public void Tick() { // increase 5 seconds per one Ticking
		if (this.Second < 55) {
			this.Second += 5;
		}
		else {
			if (this.Minute < 59) {
				this.Second = 0;
				this.Minute++;
			}
			else {
				this.Second = 0;
				this.Minute = 0;
				if (this.Hour < 23) {
					this.Hour++;
				}
				else {
					this.Hour = 0;
				}
			}
		}
		
		Notify();
	}
}
