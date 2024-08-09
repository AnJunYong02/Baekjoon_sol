import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count1=0, count2=0, count3 = 0;

        count1 = count1 + T / 300;
        T %= 300;

        count2 = count2 + T / 60;
        T %= 60;

        count3 = count3 + T / 10;
        T %= 10;

        if(T % 10 != 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(count1 + " " + count2 + " " + count3);
    }
}
