import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//11004
//5분 소요
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        ArrayList<Long> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr.add(Long.parseLong(st.nextToken()));
        Collections.sort(arr);
        System.out.println(arr.get(index-1));
    }
}
