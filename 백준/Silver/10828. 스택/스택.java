import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[10000];
        int count = 0;

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");

            if(input[0].equals("push")) {
                stack[count++] = Integer.parseInt(input[1]);
            }

            else if(input[0].equals("pop")) {
                if(count < 1) System.out.println("-1");
                else System.out.println(stack[--count]);
            }

            else if(input[0].equals("top")) {
                if(count < 1) System.out.println("-1");
                else System.out.println(stack[count-1]);
            }

            else if(input[0].equals("empty")) {
                if(count <= 0) System.out.println("1");
                else System.out.println("0");
            }

            else if(input[0].equals("size")) {
                System.out.println(count);
            }
        }
    }
}
