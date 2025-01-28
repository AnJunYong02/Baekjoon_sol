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
            double cal = Double.parseDouble(st.nextToken());

            while(st.hasMoreTokens()) {
                char ch = st.nextToken().charAt(0);
                if(ch == '@') cal *= 3;
                else if(ch == '%') cal += 5;
                else cal -= 7;
            }
            System.out.printf("%.2f\n", cal);
        }
    }
}
