
public class Employee2Test {
	public static void main(String[] args) {
		Employee2 e = new Employee2(100, "Deepesh");
		Employee2 e1 = new Employee2("Afreen", 101);
		Employee2 e2 = new Employee2("Monika", 102, 69874568921471l);
		
		e.printDetails();
		e1.printDetails();
		e2.printDetails();
	}
}
