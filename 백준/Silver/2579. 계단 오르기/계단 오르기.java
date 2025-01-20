import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N];

        //계단 점수 입력
        for(int i=0; i<N; i++) stair[i] = Integer.parseInt(br.readLine());

        //dp 이용
        int[] dp = new int[N];

        dp[0] = stair[0];
        if(N>1) {
            dp[1] = dp[0] + stair[1];
            if(N>2) dp[2] = Math.max(dp[0] + stair[2], stair[1] + stair[2]);
        }


        for(int i=3; i<N; i++) {
            dp[i] = Math.max(dp[i-2] + stair[i], dp[i-3] + stair[i-1] + stair[i]);
        }

        System.out.println(dp[N-1]);

    }
}
