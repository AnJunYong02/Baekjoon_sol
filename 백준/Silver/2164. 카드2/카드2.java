import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        int card_count = N; //남는 카드 수

        //값 넣기
        for(int i=0; i<N; i++) list.add(i+1);

        while(list.size() != 1){
            //카드 버리기
            list.removeFirst();
            card_count--;
            //맨 위 카드 아래로 옮기기
            int tmp = list.removeFirst();
            list.addLast(tmp);
        }

        System.out.println(list.removeFirst());
    }
}
