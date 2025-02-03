import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//B001

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberComputer = Integer.parseInt(br.readLine());
        int numberConnection = Integer.parseInt(br.readLine());

        int[][] computer = new int[numberComputer+1][numberComputer+1];
        boolean[] visited = new boolean[numberComputer + 1]; //방문했는지

        //입력 받기
        for (int i = 0; i < numberConnection; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computer[a][b] = 1;
            computer[b][a] = 1;
        }

        //{{}, {2,5}, {3}, {}, {7}, {2,6}
        //bfs시작
        Queue<Integer> queue = new LinkedList<>();
        int count = 0; //연결된 컴퓨터 갯수

        queue.offer(1);
        visited[1] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(int i=1; i<computer.length; i++) {
                if(computer[node][i] == 1 && !visited[i]) { //연결돼있고, 방문 안돼있다면
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
