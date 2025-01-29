import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];
        st = new StringTokenizer(br.readLine());
        for(int i=T-1; i>-1; i--) arr[i] = Integer.parseInt(st.nextToken());

        //먼저 A진법을 10진법으로 변환 -> 10진법을 B진법으로 변환

        //A진법을 10진법으로 변환
        double aToTen = 0;
        for(int i=T-1; i>-1; i--) aToTen += arr[i] * Math.pow(A,i);

        //10진법을 B진법으로 변환
        int tenToB = (int)aToTen;
        Stack<Integer> stack = new Stack<>();

        while(true){
            if(tenToB / B == 0) {
                stack.push(tenToB%B);
                break;
            }
            stack.push(tenToB%B);
            tenToB/=B;
        }

        while(!stack.isEmpty())System.out.print(stack.pop() + " ");
    }
}
