
public class Student {
	int usn;
	String name;
	static String cname;
	void read( ) {
		System.out.println("Reading");
	}
	public static void main(String[] args) {
		Student.cname = "Jspiders";
		Student s = new Student();
		s.name = "Deepesh";
		s.usn = 69;
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s.name);
		System.out.println("ID is "+s.usn);
		System.out.println("-------------------------");
		
		Student s1 = new Student();
		s1.name = "DK";
		s1.usn = 53;
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.usn);
	}
}
