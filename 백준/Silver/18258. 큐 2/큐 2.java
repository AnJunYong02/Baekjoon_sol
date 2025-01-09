
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 명령 횟수
        int n = Integer.parseInt(br.readLine());

        // java.util.Queue 클래스 대신 큐를 직접 배열로 구현
        int[] queue = new int[n*2];
        int front = 0; // 맨 앞 - 데이터를 빼는 곳
        int rear = -1; // 맨 뒤 - 데이터를 넣는 곳

        for (int i=0; i<n; i++) {
            StringBuilder cmd = new StringBuilder(br.readLine());
            int num = 0;

            if (cmd.toString().contains(" ")) {
                // push X
                StringTokenizer st = new StringTokenizer(cmd.toString());
                cmd.setLength(0); // cmd 초기화
                cmd.append(st.nextToken()); //명령여 = push
                num = Integer.parseInt(st.nextToken()); //숫자 = X
            }

            switch (cmd.toString()) {
                case "push":
                    rear++;
                    queue[rear] = num;

                    break;

                case "pop":
                    if (rear - front + 1 == 0) {
                        bw.write(Integer.toString(-1)+"\n");
                    } else {
                        bw.write(Integer.toString(queue[front])+"\n");
                        queue[front] = 0;
                        front++;
                    }

                    break;

                case "size":
                    bw.write(Integer.toString(rear - front + 1)+"\n");
                    break;
                case "empty":
                    bw.write(Integer.toString(rear - front + 1 == 0 ? 1 : 0)+"\n");
                    break;

                case "front":
                    bw.write(Integer.toString(queue[front] != 0 ? queue[front] : -1)+"\n");
                    break;

                case "back":
                    int back = rear != -1 ? rear : 0;
                    bw.write(Integer.toString(queue[back] != 0 ? queue[back] : -1)+"\n");
                    break;

            }

        }
        bw.flush();
        bw.close();
    }
}
