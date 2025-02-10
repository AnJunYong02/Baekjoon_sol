import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[100001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        dp[5] = 1;
        dp[6] = 2;
        dp[7] = 1;

        System.out.println(calCoin(N));
    }

    static int calCoin(int N){
        for(int i=8; i<=N; i++){
            dp[i] = Math.min(Math.min(dp[i-7],dp[i-5]),Math.min(dp[i-2], dp[i-1])) + 1;
        }
        return dp[N];
    }

}
