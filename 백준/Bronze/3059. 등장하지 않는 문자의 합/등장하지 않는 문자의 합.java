import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++) {
            boolean[] include = new boolean[26];
            int sum = 0;
            char[] arr = br.readLine().toCharArray();
            for (char ch : arr) {
                include[ch - 'A'] = true;
            }

            for(int j=0; j<26; j++){
                if(!include[j]){ //값이 비었다면
                    sum += j + 65;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}
