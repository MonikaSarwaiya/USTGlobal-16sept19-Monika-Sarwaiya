
public class TestAndroidOS {
	public static void main(String[] args) {
		AndroidOS a = new AndroidOS();
		a.homeScreen();
		System.out.println("---------------------");
		
		Samsung s = new Samsung();
		s.homeScreen();
		System.out.println("---------------------");
		
		Vivo v = new Vivo();
		v.homeScreen();
		System.out.println("---------------------");
		
		Redmi r = new Redmi();
		r.homeScreen();
		System.out.println("---------------------");
	}
}
