import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[][] arr = new Integer[8][2];
        Integer[] index_arr = new Integer[5];

        int sum = 0;
        int index = 0;

        for(int i=0; i<8; i++){
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = index;
            index++;
        }

        //오름차순 정렬
        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[0] > o2[0]){
                    return 1;
                }
                else return o1[0] < o2[0] ? -1 : 0;
            }
        });
        for(int i=0; i<5; i++) {
            sum += arr[i+3][0];
            index_arr[i] = arr[i+3][1];
        }
        System.out.println(sum);
        //정렬
        Arrays.sort(index_arr);
        for(int i=0; i<5; i++) System.out.print(index_arr[i]+1 + " ");



    }
}
