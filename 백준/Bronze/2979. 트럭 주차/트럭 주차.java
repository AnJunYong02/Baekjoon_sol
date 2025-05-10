import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fee = new int[3];
        fee[0] = Integer.parseInt(st.nextToken());
        fee[1] = Integer.parseInt(st.nextToken());
        fee[2] = Integer.parseInt(st.nextToken());

        int sum = 0;
        int[] time = new int[100];

        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<end; j++){
                time[j] += 1;
            }
        }

        for(int i : time){
            if(i == 1) sum += fee[0];
            else if(i==2) sum += fee[1] * 2;
            else if(i==3) sum += fee[2] * 3;
        }

        System.out.println(sum);

    }
}
