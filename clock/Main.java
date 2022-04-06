package clock;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Clock c1 = new Clock();

		boolean valid;

		do {
			valid = c1.setHours(s.nextInt()) && c1.setMinutes(s.nextInt()) && c1.setSeconds(s.nextInt());
		} while (!valid);

		c1.show();
		System.out.println();
		c1.tick();
		c1.tick();
		c1.show();
		System.out.println();
		c1.reset();
		c1.show();
	}

}
