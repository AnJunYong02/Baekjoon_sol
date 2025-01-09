
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        LinkedList<Integer> list = new LinkedList<>();
        int[] output = new int[N];

        //큐 안에 숫자 할당
        for(int i=0; i<N; i++) list.add(i+1);

        //제거되는 순서 구하기
        int remove_index = 0;
        for(int output_index = 0; output_index<N; output_index++) {
            remove_index = (remove_index + K - 1) % list.size();
            output[output_index] = list.remove(remove_index);
        }

        System.out.print("<");
        for(int i=0; i<N-1; i++) System.out.print(output[i] + ", ");
        System.out.print(output[N-1] + ">");

    }
}
