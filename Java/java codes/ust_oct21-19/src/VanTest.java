
public class VanTest {
public static void main(String[] args) {
	Van v = new Van();
	v.color = "Black";
	v.cost = 150000;
	
	System.out.println("Van cost is "+v.cost);
	System.out.println("Van color is "+v.color);
	
	v.move();
	
	Van v1 = new Van();
	v1.color = "White";
	v1.cost = 250000;
	
	System.out.println("Van v1 cost is "+v1.cost);
	System.out.println("Van v1 color is "+v1.color);
	
	v1.move();
}
}
