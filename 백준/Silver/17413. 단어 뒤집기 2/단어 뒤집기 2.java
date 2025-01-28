import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int flag = 0; //'<' 등장했는지 확인 flag, flag=1 : < 등장했다는 뜻

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '<'){
                flag = 1;
                while(!stack.isEmpty()){
                    char element = stack.pop();
                    sb.append(element);
                }
                sb.append(ch);
            }
            else if(ch == '>') {
                flag = 0;
                sb.append(ch);
            }

            else if(ch == ' ' && flag == 0) {
                while(!stack.isEmpty()) sb.append(stack.pop());
                sb.append(ch);
            }

            else if(flag == 1) sb.append(ch);


            else {
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            char element = stack.pop();
            sb.append(element);
        }
        System.out.println(sb);
    }

}
