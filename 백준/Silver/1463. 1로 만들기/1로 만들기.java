import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = 0;
        dp[1] = 0;
        System.out.println(memozation(N));
    }

    static int memozation(int N) {
        int count = 0;
        if (dp[N] == null) {
            if (N % 6 == 0) {
                int a = memozation(N / 3); //3으로 나눌경우 계산
                int b = memozation(N / 2); //2로 나눌경우 계산
                int c = memozation(N-1);
                dp[N] = Math.min(Math.min(a,b),c) + 1;

            }

            else if (N % 3 == 0) {
                dp[N] = Math.min(memozation(N/3), memozation(N-1)) + 1;
            }

            else if (N % 2 == 0) {
                dp[N] = Math.min(memozation(N/2), memozation(N-1)) + 1;
            }

            else {
                dp[N] = memozation(N-1) + 1;
            }
        }
        return dp[N];
    }
}
