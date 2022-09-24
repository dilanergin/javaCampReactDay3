package javaCampReactDay3;

public class Instructor extends User {
	private String lecture;
	private String lectureCode;
	 
	public Instructor() {
		
	}
	public Instructor(String lecture, String lectureCode) {
		this.lecture = lecture;
		this.lectureCode = lectureCode;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getLectureCode() {
		return lectureCode;
	}

	public void setLectureCode(String lectureCode) {
		this.lectureCode = lectureCode;
	}

}
