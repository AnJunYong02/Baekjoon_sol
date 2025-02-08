import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] list = new ArrayList[N+1];

        for(int i=1; i<=N; i++) list[i] = new ArrayList<>();

        for(int i=1; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        //bfs
        boolean[] visited = new boolean[N+1];
        int[] parent = new int[N+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            for (int k : list[temp]) {
                if(!visited[k]){ //방문하지 않는 Node였다면
                    queue.add(k);
                    parent[k] = temp;
                    visited[k] = true;
                }
            }
        }

        for(int i=2; i<=N; i++) System.out.println(parent[i]);

    }
}
