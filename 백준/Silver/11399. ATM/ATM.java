import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int[] dp = new int[N];

        //list에 넣기
        for(int i=0; i<N; i++) list.add(Integer.parseInt(st.nextToken()));

        //정렬하기 (오름차순으로) 31432 -> 12334 => 1, 3, 6, 9, 13 = 32
        Collections.sort(list);
        //합 출력
        int sum = 0;
        dp[0] = list.get(0);
        sum += dp[0];
        for(int i=1; i<N; i++) {
            dp[i] = dp[i-1] + list.get(i);
            sum += dp[i];
        }
        System.out.println(sum);
    }
}
