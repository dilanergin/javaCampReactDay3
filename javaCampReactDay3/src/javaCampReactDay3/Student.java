package javaCampReactDay3;

public class Student extends User {
	private int grade;

	public Student() {
		
	}

	public Student(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
