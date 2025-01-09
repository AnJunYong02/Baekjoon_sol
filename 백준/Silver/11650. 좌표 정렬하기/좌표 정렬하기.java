import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[N][2];

        for(int i = 0; i <N; i++) {
            String[] tmp_arr = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(tmp_arr[0]);
            arr[i][1] = Integer.parseInt(tmp_arr[1]);
        }

        //Sorting
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] > o2[0]) //(3,4) (1,1)
                    return 1;
                else if (o1[0].equals(o2[0])) //(1,1) (1, -1)
                    return o1[1] - o2[1];
                else return -1;
            }
        });

        printArray(arr);
    }

    public static void printArray(Integer[][] arr_list) {
        for(Integer[] arr : arr_list){
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
