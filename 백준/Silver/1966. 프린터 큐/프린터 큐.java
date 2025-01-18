import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            int count = 0; //몇번 출력됐는지
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //문서의 개수
            int M = Integer.parseInt(st.nextToken()); //문서가 queue에서 현재 몇번째에 놓여있는지, 몇번째로 출력되는지 알아야함

            st = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();

            //queue값 배열에 넣기
            for(int j=0; j<N; j++){
                int importance = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j, importance}); //index0 : 같은것중 순위, index1 : number
            }

            //찾기
            while(true) {
                int[] test = queue.poll();
                boolean flag = false; //우선순위 있는지 체크 -> 1 : 우선순위 잇음, 0 : 우선순위 없음

                for (int[] arr : queue) { //N =6, M=0, 우선순위 911111
                    if (test[1] < arr[1]) { //현재 뽑은 값 < queue에 있는 값 -> 더 큰 값이 존재한다는 것 -> 우선순위 높은게 존재함
                        flag = true;
                        break;
                    }
                }

                if (flag == false) { //내가 제일 큰 값 -> 출력해야 함, count++;
                    count++;
                    if (test[0] == M) break; //제일 큰 값인데, 찾는 값임 -> break함
                }
                else queue.add(new int[]{test[0], test[1]}); //우선순위가 존재할 경우 -> 뒤로 보내야 함
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}