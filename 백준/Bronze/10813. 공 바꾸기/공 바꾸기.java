import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Collections.swap;


public class Main {
    static int[] ball;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ball = new int[N];
        for(int i = 0; i < N; i++) ball[i] = i+1;

        for(int k=0; k<M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = ball[i-1];
            ball[i-1] = ball[j-1];
            ball[j-1] = temp;
        }

        for(int i = 0; i < N; i++) System.out.print(ball[i] + " ");
    }
}
