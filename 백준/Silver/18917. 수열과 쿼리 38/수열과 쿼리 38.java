import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long xorSum = 0;

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int firstParam = Integer.parseInt(st.nextToken());

            if (firstParam == 1) { //1 x => A의 가장 뒤에 x를 추가
                int x = Integer.parseInt(st.nextToken());
                map.put(x, map.getOrDefault(x, 0) + 1);
                sum += x;
                xorSum = xorSum ^ x;
            }

            else if (firstParam == 2) { //2 x => A에서 x를 제거, 2개 이상인 경우 앞에꺼 제거
                int x = Integer.parseInt(st.nextToken());
                if(map.get(x) > 1){ //이미 하나 이상 있다면 -> 가장 맨 앞 제거
                    map.put(x, map.get(x)-1);
                }
                else map.remove(x);
                sum -= x;
                xorSum = xorSum ^ (x);
            }

            else if(firstParam == 3) { //3 => A에 포함된 모든 원소 더한 값 출력
                System.out.println(sum);
            }

            else { //4 => A에 포함된 모든 원소 XOR한 값 출력
                System.out.println(xorSum);
            }
        }
    }
}
