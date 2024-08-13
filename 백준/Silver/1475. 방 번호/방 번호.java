import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[10];
        int count = 0; // 6과 9가 몇번 등장햇는지 -> 2번 등장시 새로운 덱 뽑아야 함

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            arr[num]++;
        }

        count = arr[6] + arr[9];
        arr[6] = arr[9] = (count + 1) / 2;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(max);
    }
}
