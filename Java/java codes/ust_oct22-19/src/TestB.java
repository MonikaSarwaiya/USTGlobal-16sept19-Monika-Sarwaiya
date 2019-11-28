
public class TestB {
	static int a = 25;
	int x;
	static TestB t;
	public static void add() {
	    //int a;
		final int b; //Only final  access modifier is supported for local variable
		//a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestB b = new TestB();
		System.out.println("X value is "+b.x);
	}
}
