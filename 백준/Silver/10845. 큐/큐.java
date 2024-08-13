import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static int[] queue;
    public static int front_index = 0;
    public static int back_index = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        queue = new int[N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if(str.equals("push")){
                int a = Integer.parseInt(st.nextToken());
                push(a);
            }
            else if(str.equals("pop")){
                System.out.println(pop());
            }
            else if(str.equals("front")){
                System.out.println(front());
            }
            else if(str.equals("back")){
                System.out.println(back());
            }
            else if(str.equals("size")){
                System.out.println(size());
            }
            else if(str.equals("empty")){
                System.out.println(empty());
            }
        }
    }

    public static void push(int a){
        queue[back_index++] = a;
    }

    public static int pop(){
        if(front_index == back_index){
            return -1;
        }
        else{
            return queue[front_index++];
        }
    }

    public static int size(){
        return back_index - front_index;
    }

    public static int empty(){
        if(front_index == back_index){
            return 1;
        }
        else return 0;
    }

    public static int front(){
        if(front_index == back_index) return -1;
        return queue[front_index];
    }

    public static int back(){
        if(front_index == back_index) return -1;
        return queue[back_index-1];
    }
}
