import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int gop = a * b * c;
		String str = Integer.toString(gop);
		
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j) -'0') == i){
					count++;
				}
			}
		System.out.println(count);
	}
	}
}

