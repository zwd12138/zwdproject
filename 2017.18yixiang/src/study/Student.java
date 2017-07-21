package study;

public class Student {
	private String name;
	private String studya;
	private String studyb;
	
	public Student(String name, String studya, String studyb) {
		super();
		this.name = name;
		this.studya = studya;
		this.studyb = studyb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudya() {
		return studya;
	}
	public void setStudya(String studya) {
		this.studya = studya;
	}
	public String getStudyb() {
		return studyb;
	}
	public void setStudyb(String studyb) {
		this.studyb = studyb;
	}
	
}
