import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 입력받은 N
        int count = 0;

        // 팩토리얼 계산
        BigInteger factorial = calFactorial(BigInteger.valueOf(N));
        String num = factorial.toString();
//        System.out.println("num = " + num);

        // 끝에서부터 연속된 0의 개수 세기
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') count++;
            else break;
        }
        System.out.println(count);
    }

    static BigInteger calFactorial(BigInteger num) {
        if (num.equals(BigInteger.ONE) || num.equals(BigInteger.ZERO)) return BigInteger.ONE;
        else return num.multiply(calFactorial(num.subtract(BigInteger.ONE))); // num * calFacotrial(num-1)
    }
}
