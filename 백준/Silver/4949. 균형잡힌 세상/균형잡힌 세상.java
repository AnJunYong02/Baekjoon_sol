import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            Stack<Character> stack = new Stack<>();
            int flag = 1;
            String str = br.readLine();
            if(str.equals(".")) break; //.입력시 종료

            //입력 받은거 검사
            for(char ch : str.toCharArray()){
                //열린 괄호 생김
                if(ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }

                //닫힌 괄호 등장시
                else if(ch == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        flag = 0;
                        break;
                    }
                }
                else if(ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{') {
                        flag = 0;
                        break;
                    }
                }
                else if(ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '[') {
                        flag = 0;
                        break;
                    }
                }
            }

            if(!stack.isEmpty() || flag == 0) sb.append("no").append("\n");
            else sb.append("yes").append("\n");
        }

        System.out.println(sb);
    }
}
