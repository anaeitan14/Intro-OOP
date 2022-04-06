package student;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] courseNames = { "Java", "C", "DB", "FULLSTACK", "SQL", "Math" };

		Student[] students = makeArray();
		for (int i = 0; i < students.length; i++) {
			printStudent(students[i]);
		}
		eachGradeAvg(students, courseNames);
	}

	public static Student[] makeArray() {
		Scanner s = new Scanner(System.in);
		Student[] students = new Student[5];
		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter the name for student number %d\n", i + 1);
			String name = s.nextLine();
			System.out.printf("Enter the ID for student number %d\n", i + 1);
			int ID = s.nextInt();
			students[i] = new Student(name, ID);
			students[i].initGrades();
			s.nextLine();

		}
		return students;
	}

	public static void printStudent(Student student) {

		double avg = student.getAverage();
		String name = student.getName();
		System.out.printf("The average of %s is %.2f\n", name, avg);

	}

	public static void eachGradeAvg(Student[] students, String[] courses) {
		double easiestCourseGrade = 0.0;
		double currentGrade=0.0;
		double hardestCourseGrade = 0.0;
		String hardestCourseName = "";
		String easiestCourseName = "";
		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < courses.length; i++) {
			for (int j = 0; j < students.length; j++) {
				sum += students[j].getGrade(i);
			}
			avg = sum / 5;
			System.out.printf("The average for %s is %.2f\n", courses[i], avg);
			currentGrade = avg;

			if (hardestCourseGrade > currentGrade) {
				hardestCourseGrade = currentGrade;
				hardestCourseName = courses[i];
			} else if (easiestCourseGrade < currentGrade) {
				easiestCourseGrade = currentGrade;
				easiestCourseName = courses[i];
			}
			avg = 0.0;
			sum = 0.0;
			currentGrade = 0.0;
		}

		System.out.printf("The easiest course is %s with an average of %.2f\n", easiestCourseName, easiestCourseGrade);
		System.out.printf("The hardest course is %s with an average of %.2f\n", hardestCourseName, hardestCourseGrade);
	}
}
