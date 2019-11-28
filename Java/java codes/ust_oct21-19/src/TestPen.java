
public class TestPen {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.brand = "Cello";
		p.color = "Blue";
		
		System.out.println("Cost is "+p.cost);
		System.out.println("Brand is "+p.brand);
		System.out.println("Color is "+p.color);
		
		p.write();
	}
}
