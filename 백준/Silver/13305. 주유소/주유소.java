import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int city = Integer.parseInt(br.readLine()); // 도시 수
        int[] distance = new int[city - 1]; // 도시 사이 거리
        int[] fuelPrice = new int[city]; // 도시마다 주유 가격

        // 거리 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < city - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        // 주유소 가격 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < city; i++) {
            fuelPrice[i] = Integer.parseInt(st.nextToken());
        }

        long totalPrice = 0; // 총 비용 (long으로 변경, 입력 제한이 크기 때문에)
        int minFuel = fuelPrice[0]; // 첫 번째 도시에서의 최소 기름값

        for (int i = 0; i < city - 1; i++) {
            // 현재 도시와 다음 도시까지 거리만큼 기름값 계산
            totalPrice += (long) distance[i] * minFuel;

            // 최소 기름값 갱신 (다음 도시의 기름값이 더 작다면 갱신)
            if (fuelPrice[i + 1] < minFuel) {
                minFuel = fuelPrice[i + 1];
            }
        }

        System.out.println(totalPrice);
    }
}
