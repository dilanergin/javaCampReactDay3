package javaCampReactDay3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(4);
		student.setName("dilan");
		student.setAge(4);
		student.seteMail("sjahjd@");
		student.setGrade(3);
		
		Instructor instructor = new Instructor("tarih","trh45");
		instructor.setName("emre");
		instructor.setAge(44);
		instructor.seteMail("bdhshj@");
		instructor.setPhoneNumber("8787676");
		
		System.out.println(student.geteMail());
		
		UserManager[] managers = new UserManager[] {new StudentManager(), new InstructorManager()};
		for(UserManager manager: managers) {
			System.out.println(manager.logIn());
		}
	}
}