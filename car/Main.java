package car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Car myCar = new Car();

		myCar.setLicenseNumber(s.nextInt());
		myCar.printDetails();
		System.out.println();
		System.out.println("How much would you like to accelerate the car?");
		int userSpeed = s.nextInt();
		for (int i = 0; i < userSpeed; i++) {
			myCar.accelerate();
		}
		myCar.decelerate();
		myCar.decelerate();
		myCar.printDetails();
		System.out.println();
		myCar.stopCar();
		myCar.printDetails();
		
	}
}
