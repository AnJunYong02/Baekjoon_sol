import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static ArrayList<Integer>[] list;
    public static boolean[] visited;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // edge (정점 개수)
        M = Integer.parseInt(st.nextToken()); // vertex (간선 개수)

        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        // list 배열 초기화
        for (int i = 0; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        count = 0; // 연결 요소의 갯수

        // 그래프 입력 받기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u); // 무방향 그래프인 경우 필요
        }

        // DFS로 연결 요소 찾기
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                DFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void DFS(int i) {
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        visited[i] = true; // 방문 표시

        while (!stack.isEmpty()) {
            int nearIndex = stack.pop();

            for (int index : list[nearIndex]) {
                if (!visited[index]) {
                    visited[index] = true;
                    stack.push(index); // 스택에 추가
                }
            }
        }
    }
}
