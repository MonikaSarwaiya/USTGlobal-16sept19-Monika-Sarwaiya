
public class B extends A{

	private void m1() {
		System.out.println("B class");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
	}
}
