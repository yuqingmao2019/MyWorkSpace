package exception;

public class Student {

	static String schoolName;
	private String name;
	private String age;
	
	
	
	public static String getSchoolName() {
		return schoolName;
	}



	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
