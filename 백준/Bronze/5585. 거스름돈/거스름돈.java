import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        input = 1000 - input;
        int count = 0;
        int[] divide_arr = {500,100,50,10,5,1};

        for(int i=0; i<divide_arr.length; i++){
            int tmp = input / divide_arr[i]; //동전 사용 갯수 계산
            input = input % divide_arr[i]; //동전 뺀 것
            count += tmp; //동전 사용 더하기
        }

        System.out.println(count);
    }
}
