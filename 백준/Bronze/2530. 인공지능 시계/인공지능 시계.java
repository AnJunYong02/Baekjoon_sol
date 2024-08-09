import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);
        int sec = Integer.parseInt(input[2]);
        int plus_time = Integer.parseInt(br.readLine());

        int cal_time = hour * 3600 + min * 60 + sec + plus_time;

        int cal_hour = (cal_time / 3600) % 24;
        int cal_min = (cal_time % 3600) / 60;
        int cal_sec = cal_time % 60;

        System.out.println(cal_hour + " " + cal_min + " " + cal_sec);
    }
}
