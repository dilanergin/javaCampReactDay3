package javaCampReactDay3;

public class User {

	private String name;
	private String phoneNumber;
	private String eMail;
	private int age;

	public User() {

	}

	public User(String name, String phoneNumber, String eMail, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
