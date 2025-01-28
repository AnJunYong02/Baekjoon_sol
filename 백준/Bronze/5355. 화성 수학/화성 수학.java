import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++) {
            float cal = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                if(str.equals("@")) cal *= 3;
                else if(str.equals("%")) cal += 5;
                else if(str.equals("#")) cal -= 7;
                else cal += Float.parseFloat(str);
            }
            sb.append(String.format("%.2f", cal)).append("\n");
        }
        System.out.println(sb);
    }
}
