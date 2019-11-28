
public class Factorial {
static int fact(int n) {
	if(n >= 1) {
		return n*fact(n-1);
	} else {
		return 1;
	}
}
public static void main(String[] args) {
	int a = fact(5);
	System.out.println("Factorial is "+a);
}
}
