
public class BusTest {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.getDetails();

		Bus b1 = new Bus(50);
		b1.getDetails();

		Bus b2 = new Bus(60, "black");
		b2.getDetails();
	}
}
