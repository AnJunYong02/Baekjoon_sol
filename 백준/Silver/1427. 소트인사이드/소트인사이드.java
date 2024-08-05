import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        int[] arr_int = new int[arr.length];

        for(int i=0; i<arr_int.length; i++) {
            arr_int[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arr_int);

        for(int i = arr_int.length-1; i>=0; i--) {
            System.out.print(arr_int[i]+"");
        }

//        for (int j : arr_int) {
//            System.out.print(j + "");
//        }

        br.close();
    }
}
