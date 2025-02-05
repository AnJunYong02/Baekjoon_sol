import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visited = new boolean[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        int count = dfs(start, N);

        System.out.println(count);
    }

    static int dfs(int start, int N){
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()){
            int cur = stack.pop(); //3
            int move = arr[cur]; //2

            if(cur + move <= N && !visited[cur+move]){ //돌다리 범위 안에 들고, 방문하지 않은 돌다리라면 -> 해당 돌다리로 이동
                stack.push(cur + move);
                visited[cur+move] = true;
                count++;
            }

            if(cur - move > 0 && !visited[cur-move]){
                stack.push(cur - move);
                visited[cur-move] = true;
                count++;
            }
        }
        return count;
    }
}
