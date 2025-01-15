import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()); //벨트 갯수
        int rotation = 0; //회전방향 (0:시계, 1:반시계)
        double ratio = 1;

        for(int i=0; i<M; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]); //i 회전수
            int b = Integer.parseInt(str[1]); //i+1 회전수
            int s = Integer.parseInt(str[2]); //꼬였는지 (안꼬이면 0, 꼬이면 1)

            //계산
            double divide = (double) b /a;
            ratio = ratio * divide;
            if(s==1){ //꼬였다면 회전방향 바뀜
                if(rotation==1) rotation=0;
                else rotation = 1;
            }
        }

        System.out.println(rotation + " " + (int)(ratio));
    }
}
