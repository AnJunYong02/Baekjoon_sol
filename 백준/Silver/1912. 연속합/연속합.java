import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] input;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int[n];
        dp = new int[n];

        for(int i = 0; i < n; i++) input[i] = Integer.parseInt(st.nextToken());
        dp[0] = input[0];
        //dp 이용
        int max = dp[0];
        for(int i=1; i<n; i++) {
            dp[i] = Math.max(input[i], dp[i-1] + input[i]);
            if(dp[i] > max) max = dp[i];
        }

        //최댓값 출력
        System.out.println(max);
    }
}
