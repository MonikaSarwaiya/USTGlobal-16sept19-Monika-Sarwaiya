
public class SubClass extends SuperClass {
	String s = "SubClass variable";

	SubClass() {
		super();
		System.out.println("Sub Class Constructor");
	}
	
	void getSData() {
		System.out.println(s);
	    System.out.println(this.s);
	    System.out.println(super.s);
	    System.out.println("-------------------------");
	    super.superClassMethod();
	    superClassMethod();
	}
}
