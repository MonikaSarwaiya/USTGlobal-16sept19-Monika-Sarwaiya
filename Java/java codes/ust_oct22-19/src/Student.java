
public class Student {
	String sname;
	String clgName;
	String branch;
	int rollno;
	int age;

	void showDetails() {
		System.out.println("Student name is "+sname);
		System.out.println("Student ClgName is "+clgName);
		System.out.println("Student branch is "+branch);
		System.out.println("Student rollno is "+rollno);
		System.out.println("Student age is "+age);
	}

	public Student(String sname, String clgName, String branch, int rollno, int age) {
		this.sname = sname;
		this.clgName = clgName;
		this.branch = branch;
		this.rollno = rollno;
		this.age = age;
		this.showDetails();
	}

	public static void main(String[] args) {
		Student s = new Student("Deepesh", "LNCT", "CSE", 53, 22);
		System.out.println("----------------------------");
		Student s1 = new Student("Afreen", "JSP", "EEE", 54, 22);
		System.out.println("----------------------------");
		Student s2 = new Student("Monika", "TIT", "ECE", 55, 22);
		System.out.println("----------------------------");
		Student s3 = new Student("Shivani", "JSP", "ECE", 56, 23);
		System.out.println("----------------------------");
		Student s4 = new Student("Rahul", "Bansal", "ME", 57, 25);
		System.out.println("----------------------------");
		Student s5 = new Student("Safiya", "JSP", "CSE", 58, 22);
		System.out.println("----------------------------");
		Student s6 = new Student("Adikar", "Bansal", "EEE", 59, 26);
		System.out.println("----------------------------");
		Student s7 = new Student("Sadiya", "JSP", "ECE", 60, 23);
		System.out.println("----------------------------");
		Student s8 = new Student("Vishal", "UEC", "CME", 61, 22);
		System.out.println("----------------------------");
		Student s9 = new Student("Pallavi", "JSP", "IT", 62, 23);
		System.out.println("----------------------------");
	}
}
