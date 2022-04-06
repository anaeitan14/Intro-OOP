package student;

public class Student {
	private String name;
	private int ID;
	private int[] grades;

	public void setName(String s) {
		this.name = s;
	}

	public String getName() {
		return this.name;
	}

	public void setID(int i) {
		this.ID = i;
	}

	public int getID() {
		return this.ID;
	}

	public Student(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public boolean setGrade(int courseIndex, int mark) {
		if (courseIndex < grades.length) {
			grades[courseIndex] = mark;
			return true;
		} else {
			return false;
		}
	}

	public int getGrade(int courseIndex) {
		return grades[courseIndex];
	}

	public double getAverage() {
		double avg = 0.0;
		for (int i = 0; i < 6; i++) {
			avg += getGrade(i);
		}
		return avg / grades.length;
	}

	public void initGrades() {
		grades = new int[6];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = (int) ((Math.random() * 61) + 40);
		}
	}

	public void show() {
		System.out.println("Student name: " + name + " Student ID: " + ID);
	}
}
