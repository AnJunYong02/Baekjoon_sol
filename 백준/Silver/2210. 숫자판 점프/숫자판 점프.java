import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static String[][] arr;
    static HashSet<String> set;
    static int[] moveX = {1,-1,0,0}; //오, 왼, 위, 아래
    static int[] moveY = {0,0,1,-1}; //오, 왼, 위, 아래

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new String[5][5];
        set = new HashSet<>();

        //판 채우기
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++) arr[i][j] = st.nextToken();
        }

        //DFS
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) dfs(i, j, 0, arr[i][j]);
        }

        System.out.println(set.size());
    }


    static void dfs(int x, int y, int count, String num){

        if(count == 5){ //종료 조건
            if(!set.contains(num)) set.add(num);
            return;
        }

        for(int i=0; i<4; i++){ //=>1. 오른쪽 2. 왼쪽, 3. 위, 4. 아래
            int curX = x + moveX[i];
            int curY = y + moveY[i];
            if(curX >=0 && curY >=0 && curX < 5 && curY < 5)
                dfs(curX, curY, count+1, num + arr[curX][curY]); //범위안에 있다면 => dfs 그 번호 호출
        }
    }
}
