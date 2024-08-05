
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for(int i=0; i<n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for(Integer listElement : list) {
            bw.write(listElement + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
