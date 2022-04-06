package clock;

public class Clock {
	private int minutes, hours, seconds;

	public boolean setMinutes(int m) {
		minutes = m;
		if (minutes > 59 || minutes < 0) {
			minutes = 0;
			System.out.println("Not a valid value");
			return false;
		} else {
			return true;
		}
	}

	public boolean setHours(int h) {
		hours = h;
		if (hours > 23 || hours < 0) {
			hours = 0;
			System.out.println("Not a valid value");
			return false;
		} else {
			return true;
		}
	}

	public boolean setSeconds(int s) {
		seconds = s;
		if (seconds > 59 || seconds < 0) {
			seconds = 0;
			System.out.println("Not a valid value");
			return false;
		} else {
			return true;
		}
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void tick() {
		seconds++;
		minutes += seconds / 60;
		hours += minutes / 60;
		seconds %= 60;
		minutes %= 60;
		hours %= 24;
	}

	public void show() {
		if (hours < 10) {
			System.out.print("0");
		}
		System.out.print(hours + ":");

		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes + ":");

		if (seconds < 10) {
			System.out.print("0");
		}
		System.out.print(seconds);
	}

	public void reset() {
		minutes = 0;
		hours = 0;
		seconds = 0;
	}
}