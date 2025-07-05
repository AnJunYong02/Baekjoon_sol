import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<String> stack = new Stack<>();
        int[] arr = new int[100000];

        int razerCount = 0; //구간 동안 레이저 발사 횟수
        int count = 0; // 잘린 조각수
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '('){ // '(' -> push
                stack.push(String.valueOf(ch));
            }
            else if(ch == ')'){ //')' -> pop
                stack.pop();
                if(input.charAt(i-1) == '(') count += stack.size();
                else if(input.charAt(i-1) == ')') {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
