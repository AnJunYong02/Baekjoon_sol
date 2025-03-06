import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long sum = 0;
        long xorSum = 0;

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int firstParam = Integer.parseInt(st.nextToken());

            //1 x => A의 가장 뒤에 x를 추가
            if (firstParam == 1) {
                int x = Integer.parseInt(st.nextToken());
                sum += x;
                xorSum = xorSum ^ x;
            }

            //2 x => A에서 x를 제거, 2개 이상인 경우 앞에꺼 제거
            else if (firstParam == 2) {
                int x = Integer.parseInt(st.nextToken());
                sum -= x;
                xorSum = xorSum ^ (x);
            }

            //3 => A에 포함된 모든 원소 더한 값 출력
            else if(firstParam == 3) System.out.println(sum);

            //4 => A에 포함된 모든 원소 XOR한 값 출력
            else System.out.println(xorSum);
        }
    }
}
