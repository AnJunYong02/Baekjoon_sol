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

        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());

        int count = 0;
        int index = N-1;
        int CurrentMoney = K;

        while(CurrentMoney!=0){
            int calMoney = CurrentMoney-arr[index];
            if(calMoney >= 0) { //주어진 돈에서 가장 크게 뺀 경우 -> count++
                CurrentMoney = calMoney;
                count++;
            }
            else index--;
        }

        System.out.println(count);
    }
}
