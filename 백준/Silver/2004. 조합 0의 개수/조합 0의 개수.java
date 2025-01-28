import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 5의 개수와 2의 개수를 따로 계산해야 정확한 끝자리 0 개수를 알 수 있음
        int zeroCount5 = countZero(n, 5) - (countZero(n - m, 5) + countZero(m, 5));
        int zeroCount2 = countZero(n, 2) - (countZero(n - m, 2) + countZero(m, 2));

        // 5와 2의 개수 중 작은 값을 선택해야 정확한 0의 개수를 구할 수 있음
        System.out.println(Math.min(zeroCount5, zeroCount2));
    }

    // 특정 소인수(primeFactor)의 개수를 세는 함수 (ex. 5의 개수, 2의 개수)
    static int countZero(int n, int primeFactor) {
        int count = 0;
        while (n >= primeFactor) {
            count += n / primeFactor;
            n /= primeFactor;
        }
        return count;
    }
}
