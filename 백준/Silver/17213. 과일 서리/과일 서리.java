import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //과일의 종류
        int M = Integer.parseInt(br.readLine()); //훔칠 과일의 갯수

        int K = M-N; //공식적용
        BigInteger topNum = factorial(N+K-1); //분자
        BigInteger bottomNum1 = factorial(N-1); //N-M!
        BigInteger bottomNum2 = factorial(K);

        System.out.println(topNum.divide(((bottomNum1)).multiply(bottomNum2)));
    }

    static BigInteger factorial(int k) {
        if(k==0) return BigInteger.ONE;
        return BigInteger.valueOf(k).multiply(factorial(k-1)); // k * factorial(k-1)r
    }
}
