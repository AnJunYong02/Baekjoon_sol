import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = Long.parseLong(br.readLine());
        long cal_sum = 0;
        int count = 1;
        while(true){
            cal_sum = (count * (count + 1L)) / 2;
            if(cal_sum > sum){
                break;
            }
            count++;
        }
        System.out.println(count-1);
        br.close();
    }

}
