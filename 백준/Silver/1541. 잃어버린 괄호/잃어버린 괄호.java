import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        // 1. 덧셈 부분 먼저 계산 -> 가장 큰 값을 빼기함
        // 10 + 23 - (55 + 12 + 32) - 23 - 32
        StringTokenizer substraction = new StringTokenizer(br.readLine(), "-");

        while(substraction.hasMoreTokens()){
            StringTokenizer addition = new StringTokenizer(substraction.nextToken(), "+");
            int tempSum = 0;
            while(addition.hasMoreTokens()) tempSum += Integer.parseInt(addition.nextToken());
            if(sum == Integer.MAX_VALUE) sum = tempSum;
            else sum -= tempSum;
        }

        System.out.println(sum);
    }
}
