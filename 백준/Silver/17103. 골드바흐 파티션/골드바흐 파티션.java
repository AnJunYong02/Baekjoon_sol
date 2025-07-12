//17103
//1시간 15분
//시간 초과 잡으려고 별짓을 다하다가 결국 지피티한테 물어보니 에라토스테네스의 체인지 뭔지 그거 이용하라고 해서 풀라고 함,
// 다른 블로그 풀이들도 보니 다 에라토스테네스의 체를 이용해서 풀었음 -> 그래야 시간 최적화 가능

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX+1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        //소수 미리 계산
        calPrime();

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            // a + b = N 일 때, a<=b이므로, a < N/2까지 탐색
            for(int j = 2; j<=N/2; j++){
                if(isPrime[j] && isPrime[N-j]) count++;
            }
            System.out.println(count);
        }
    }

    //N 이하인 소수들 배열에 넣기
    static void calPrime(){
        for(int i=2; i<= MAX; i++) isPrime[i] = true; //소수라고 가정하고 시작

        for(int i=2; i * i <= MAX; i++){
            if(isPrime[i]){ //소수라면
                for(int j = i*i; j<=MAX; j+=i) { //i의 배수들 소수 아닌거로 처리, i=2 -> 4,6,.....
                    isPrime[j] = false;
                }
            }
        }
    }
}
