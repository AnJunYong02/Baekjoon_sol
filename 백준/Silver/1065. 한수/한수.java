import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=1; i<=N; i++) {
            if(i>0 && i<100){ //1~99
                count ++;
            }

            else if(i>=100) { //ex)100, 101, 999
                String[] str_arr = String.valueOf(i).split("");
                int a = Integer.parseInt(str_arr[1]) - Integer.parseInt(str_arr[0]);
                int b = Integer.parseInt(str_arr[2]) - Integer.parseInt(str_arr[1]);
                if(a==b) count++;
            }

            else {//ex) 1000
                String[] str_arr = String.valueOf(i).split("");
                int a = Integer.parseInt(str_arr[1]) - Integer.parseInt(str_arr[0]);
                int b = Integer.parseInt(str_arr[2]) - Integer.parseInt(str_arr[1]);
                int c = Integer.parseInt(str_arr[3]) - Integer.parseInt(str_arr[2]);
                if(a==b && b==c) count++;
            }
        }

        System.out.println(count);
    }
}
