
public class Employee {
	String name;
	int eid;

	public Employee(String ename, int empid) {
		name = ename;
		eid = empid;
	}
	
    void printDetails() {
    	System.out.println("Employee name is "+name);
    	System.out.println("Employee id is  "+eid);
    }
    
	public static void main(String[] args) {
		Employee e = new Employee("Deepesh", 53);

		Employee e1 = new Employee("DK", 69);

		Employee e2 = new Employee("Deepu", 59);

		e.printDetails();
		e1.printDetails();
		e2.printDetails();
	}
}
