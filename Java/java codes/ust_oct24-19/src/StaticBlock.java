
public class StaticBlock {
	static int a;
	int b;
	static {
		a = 10;
		System.out.println("Static Block 1");
	}

	StaticBlock() {
		System.out.println("StaticBlock Constructor");
	}

	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		StaticBlock sb1 = new StaticBlock();
		System.out.println("a value is "+a);
	}

	static {
		a = 20;
		System.out.println("Static Block 2");
	}
	
	static {
		a = 40;
		System.out.println("Static Block 3");
	}
}
