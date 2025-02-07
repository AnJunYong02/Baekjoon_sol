import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        //입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(br.readLine());

        //a + b = x를 만족하는 순서쌍 찾기
        Arrays.sort(arr); //오름차순 정렬 {1,2,3,5,7,9,10,11,12}

        int count = 0;
        int left = 0;
        int right = N-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == X) {
                count++;
                left++;
                right--;
            }
            else if(sum > X) right--; //
            else left++; //sum < X
        }

        System.out.println(count);
    }
}
