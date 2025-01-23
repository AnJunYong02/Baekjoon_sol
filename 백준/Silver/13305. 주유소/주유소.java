import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int city = Integer.parseInt(br.readLine()); //도시 수
        int[] distance = new int[city - 1]; //도시 사이 거리
        int[] fuelPrice = new int[city]; //도시마다 주유 가격

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < city - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < city; i++) {
            fuelPrice[i] = Integer.parseInt(st.nextToken());
        }

        int totalPrice = 0;
        int travleCity = 0; //이동가능한 기름 양
        int minFuel = fuelPrice[0];
        int index = 0;

        while (travleCity < city-1) { //도시 끝까지 가기까지
            if (minFuel > fuelPrice[index+1]) { //싼 도시의 기름값을 만난다면 -> 최소 기름값 바꿈
                totalPrice += (distance[index] * minFuel); //기름넣는양 = 지금도시 거리 * 기름 값
                minFuel = fuelPrice[index + 1];
            }
            else { //더 작은 기름값 만나기까지 계속해서 최소 기름값 더해나감
                totalPrice += (distance[index] * minFuel); //다음도시까지 거리 * 최소 기름 값
            }
            travleCity++;
            index++;
        }
        System.out.println(totalPrice);
    }
}
