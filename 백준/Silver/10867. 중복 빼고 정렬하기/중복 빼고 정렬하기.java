import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            int tmp = Integer.parseInt(str[i]);
            if(!arr.contains(tmp)){ //리스트에 없는 경우 (중복 확인 위함)
                arr.add(tmp);
            }
        }

        //정렬
        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
