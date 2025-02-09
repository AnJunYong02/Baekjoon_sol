import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static String[] standard;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] bingo = new String[N];
        standard = new String[N+2];
        Arrays.fill(standard, "0");

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) bingo[i] = st.nextToken();

        //문제 풀이
        int count = 0;
        for(int i=0; i<N; i++){
            if(!standard[i].equals(bingo[i])) { //bingo == standard
                changeNum(i);
                changeNum(i + 1);
                changeNum(i + 2);
                count++;
            }
        }
        System.out.println(count);
    }

    static void changeNum(int i){
        if(standard[i].equals("0")) standard[i] = "1";
        else standard[i] = "0";
    }
}
