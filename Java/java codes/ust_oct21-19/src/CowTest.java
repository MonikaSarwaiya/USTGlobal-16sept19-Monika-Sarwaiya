
public class CowTest {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.color = "White";
		c.name = "Ramdulari";

		System.out.println("Cow color is "+c.color);
		System.out.println("Cow name is "+c.name);

		c.eat();
		c.sleep();
		
		System.out.println("----------------------------");
		
		Cow c1 = new Cow();
		c1.color = "Brown";
		c1.name = "Sundari";

		System.out.println("Cow c1 color is "+c1.color);
		System.out.println("Cow c1 name is "+c1.name);

		c1.eat();
		c1.sleep();
		
	}

}
