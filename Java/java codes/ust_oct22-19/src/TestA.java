
public class TestA {
	public static int add(int a, int b) {
		System.out.println("add(int a, int b) method");
		return a + b;
	}
	public static long add(long a, int b) {
		System.out.println("add(long a, int b) method");
		return a + b;
	}
	public static void add(int a, byte b) {
		System.out.println("add(int a, byte b) method");
	}
	public int multiply(int a, int b) {
		System.out.println("multiply(int a, int b) method");
		return a * b;
	}
	public int multiply(byte a, int b) {
		System.out.println("multiply(byte a, int b) method");
		return a * b;
	}
	public static void main(String[] args) {
        System.out.println("main(String args[])");
        main(10);
        add(52, 23);
        add(98l, 56);
        add(10, 12);
        
        TestA a = new TestA();
        a.multiply(5, 5);
        a.multiply(12, 45);
	}
	public static void main(int a) {
		System.out.println("main(int a) method");
	}
}