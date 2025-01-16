import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int tmp_a = a;
            int tmp_b = b;

            while(tmp_a % tmp_b != 0){ //6 10
               int temp = tmp_a % tmp_b; //2
               tmp_a = tmp_b; // tmp_a <- 6
               tmp_b = temp; //tmp_b <- 2
            }

            System.out.println(a*b / tmp_b);

        }
    }
}
