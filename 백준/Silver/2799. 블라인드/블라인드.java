import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 층 수
        int N = Integer.parseInt(st.nextToken()); // 층 당 창문 개수

        int[] windowType = new int[5]; // 창문 종류 (0~4)

        // 창문 시작
        int[] starCount = new int[N];
        int[] ans = new int[5]; // 0~4개의 별 개수 카운팅

        br.readLine(); // ## 건너뛰기

        for (int i = 0; i < M; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                String temp = br.readLine();
                for (int j = 0; j < N; j++) {
                    // 🔹 예외 방지: `5 * j + 1`이 `temp.length()`보다 작은지 확인 후 접근
                    if (5 * j + 1 < temp.length() && temp.charAt(5 * j + 1) == '*') {
                        starCount[j]++;
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                // 🔹 예외 방지: `starCount[j]` 값이 `ans.length`를 초과하지 않는지 확인
                if (starCount[j] < ans.length) {
                    ans[starCount[j]]++;
                }
            }

            Arrays.fill(starCount, 0);
            br.readLine(); // 층 사이의 빈 줄 처리
        }

        // 🔹 창문 개수 세기
        for (int i = 0; i < 5; i++) {
            windowType[i] = ans[i]; // 0~4개의 별 개수를 창문 타입에 매핑
        }

        // 🔹 결과 출력
        for (int i = 0; i < 5; i++) {
            System.out.print(windowType[i] + " ");
        }
    }
}
