import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1149
public class Main {
    public static int[][] cost;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }
        dp = new int[N][3];
        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        System.out.println(Math.min(Math.min(calMin(N-1, 0), calMin(N-1, 1)), calMin(N-1,2)));
    }

    public static int calMin(int N, int color) {
        if(dp[N][color] == 0){
            if(color == 0){ // RED
                dp[N][color] = Math.min(calMin(N-1, 1), calMin(N-1, 2)) + cost[N][color];

            }
            else if(color == 1){ // Green
                dp[N][color] = Math.min(calMin(N-1, 0), calMin(N-1, 2)) + cost[N][color];
            }
            else{ // Blue
                dp[N][color] = Math.min(calMin(N-1, 0), calMin(N-1, 1)) + cost[N][color];
            }
        }
        return dp[N][color];
    }
}
