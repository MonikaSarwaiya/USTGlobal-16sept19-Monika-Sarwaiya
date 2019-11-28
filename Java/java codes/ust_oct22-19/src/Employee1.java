
public class Employee1 {
	String name;
	int eid;

	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
    void printDetails() {
    	System.out.println("Employee name is "+name);
    	System.out.println("Employee id is  "+eid);
    	this.sayHello();
    }
    
    void sayHello() {
    	System.out.println("Hello "+name+" Welcome to UST Global company");
    }
	public static void main(String[] args) {
		Employee1 e = new Employee1("Afreen", 22);

		Employee1 e1 = new Employee1("Monika", 23);

		Employee1 e2 = new Employee1("Shivani", 24);

		e.printDetails();
		e1.printDetails();
		e2.printDetails();
	}
}

