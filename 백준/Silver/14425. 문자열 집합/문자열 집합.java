import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> S = new HashSet<String>();

        for(int i=0; i<N; i++) S.add(br.readLine());

        //값 있는지 check
        int count = 0;

        for(int i=0; i<M; i++){
            String str = br.readLine();
            if(S.contains(str)) count++;
        }

        System.out.println(count);

    }
}
