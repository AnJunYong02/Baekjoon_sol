import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            BigInteger num = new BigInteger(br.readLine());

            if(num.mod(BigInteger.TWO).equals(BigInteger.ZERO)) sb.append("even").append('\n');
            else sb.append("odd").append('\n');
        }
        System.out.println(sb);
    }
}
