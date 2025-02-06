import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        int count = 0;

        // 가장 큰 금액부터 차례로 사용
        for (int i = N - 1; i >= 0; i--) {
            if (K == 0) break; // 남은 금액이 0이면 종료
            if (K >= arr[i]) { // 현재 동전을 사용할 수 있는 경우
                count += K / arr[i]; // 사용할 수 있는 최대 개수 더하기
                K %= arr[i]; // 남은 금액 갱신
            }
        }

        System.out.println(count);
    }
}
