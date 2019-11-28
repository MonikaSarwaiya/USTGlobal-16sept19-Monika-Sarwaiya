
public class InstanceBlock {
	static int a;
	int b;
	{
		a = 10;
		b = 20;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib1 = new InstanceBlock();
		System.out.println("main ended");
	}
	
	{
		System.out.println("Instance Block 2");
	}
}
