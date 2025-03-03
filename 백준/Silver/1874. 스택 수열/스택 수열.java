import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] match = new int[N];
        for(int i=0;i<N;i++) match[i] = Integer.parseInt(br.readLine());

        //match 시키기
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        int index = 0;
        boolean flag = true; //만드는거 가능한지 여부

        while(true){
            if(index >= N) break;

            while(num <= match[index]){
                stack.push(num++);
                sb.append("+").append("\n");
            }

            if(!stack.isEmpty() && stack.peek() == match[index]){
                stack.pop();
                index++;
                sb.append("-").append("\n");
            }
            else {
                flag = false;
                break;
            }
        }

        if(!flag) {
            sb.delete(0, sb.length());
            sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
