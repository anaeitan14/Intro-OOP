package person;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Person[] people = new Person[5];

		for (int i = 0; i < people.length; i++) {
<<<<<<< HEAD
			double weight = (int) ((Math.random() * (350.0 - 30.0) + 30.0));
			double height = (int) ((Math.random() * (260 - 150) + 150));
			System.out.printf("Enter the name of person %d\n", i + 1);
			String name = s.nextLine();
			people[i] = new Person(name, weight, height);
		}

		printPeople(people);

		System.out.println("---------------------- pre sort");
		sortWeight(people);
		printPeople(people);
		System.out.println("---------------------- post weight sort");
		sortHeight(people);
		printPeople(people);
=======
			people[i] = new Person();
			System.out.printf("Enter the name of person %d\n", i + 1);
			people[i].setName(s.nextLine());
			System.out.printf("Enter the height of person %d\n", i + 1);
			people[i].setHeight(s.nextDouble());
			System.out.printf("Enter the weight of person %d\n", i + 1);
			people[i].setWeight(s.nextDouble());
			s.nextLine();
		}

		for (int i = 0; i < people.length; i++) {
			people[i].show();
		}
		
		System.out.println("---------------------- pre sort");
		sortWeight(people);
		for (int i = 0; i < people.length; i++) {
			people[i].show();
		}
		System.out.println("---------------------- post weight sort");
		sortHeight(people);
		for (int i = 0; i < people.length; i++) {
			people[i].show();
		}
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
		System.out.println("---------------------- post height sort");
	}

	public static void sortWeight(Person[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].getWeight() > arr[j + 1].getWeight()) {
					Person tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void sortHeight(Person[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].getHeight() < arr[j + 1].getHeight()) {
					Person tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
<<<<<<< HEAD

	public static void printPeople(Person[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
=======
>>>>>>> 85e2b94145010ecbbaac2a645e233a0643ec9bad
}