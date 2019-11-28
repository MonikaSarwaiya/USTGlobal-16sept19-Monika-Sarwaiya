
public class TestGen {
	public static void main(String[] args) {

		FirstGen fg = new FirstGen();
		fg.call();
		fg.msg();
		System.out.println("-------------------------");

		SecondGen sg = new SecondGen();
		sg.call();
		sg.games();
		sg.msg();
		System.out.println("-------------------------------");

		ThirdGen tg = new ThirdGen();
		tg.call();
		tg.camera();
		tg.games();
		tg.msg();
	}
}
