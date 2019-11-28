
public class Toyota implements AutoMobile {

	@Override
	public int gear() {
		System.out.println("gear() of Toyota");
		return 20;
	}

	@Override
	public void gps() {
		System.out.println("gps() of Toyota");
	}

}
