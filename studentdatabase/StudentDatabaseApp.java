package studentdatabase;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	
		Student s1=new Student();
		s1.enroll();
		s1.payTuitionAmount();
		System.out.println(s1.showInfo());
	}

}
