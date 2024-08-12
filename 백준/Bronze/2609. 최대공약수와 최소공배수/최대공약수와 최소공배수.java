import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int k = gcd(a,b);


        System.out.println(k);
        System.out.println(a * b / k);
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a % b);
    }
}
