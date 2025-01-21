import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int k1 = (a+b)%c;
		int k2 = ((a%c) + (b%c)) % c;
		int k3 = (a*b)%c;
		int k4 = ((a%c) * (b%c)) %c;
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
	}
}