
public class RunningTimer {
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		AnalogClock analogClock = new AnalogClock(timer);
		DigitalClock digitalClock = new DigitalClock(timer);
		
		while(true) {
			System.out.println("***Choose one option***");
			System.out.println("1. Ticking the timer");
			System.out.println("2. Looking at the Digital Timer");
			System.out.println("3. Looking at the Analog Timer");
			System.out.println("4. Exit the program");
			
		}
	}
}
