import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.StringTokenizer;

//4963
public class Main {
    static int arr[][];
    static boolean visit[][];
    static int[] dirX = {0, 0, -1, 1, -1, 1, 1, -1}; //오, 왼, 위, 아래, 오위, 오아, 왼아, 왼위
    static int[] dirY = {1, -1, 0, 0, 1, 1, -1, -1};
    static int w, h;

    public static void main(String[] args) throws IOException, InputMismatchException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) break;

            arr = new int[h][w];
            visit = new boolean[h][w];

            for(int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    visit[i][j] = false;
                }
            }
            //해당 땅에 주변 섬이 인접해 있는지 체크
            int islandCount = 0;
            for(int i=0; i<h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visit[i][j] && arr[i][j] == 1) {
                        islandCount++;
                        DFS(i, j);
                    }
                }
            }
            sb.append(islandCount).append("\n");
        }

        System.out.println(sb);
    }

    public static void DFS(int x, int y){
        visit[x][y] = true;

        for(int i=0; i<8; i++){
            int nowX = x + dirX[i];
            int nowY = y + dirY[i];
            if(validRange(nowX, nowY) && arr[nowX][nowY] == 1 && !visit[nowX][nowY]){
                DFS(nowX, nowY);
            } //계산한 방향에서 땅이 있고, 그 땅을 방문한 적 없다면 -> 하나로 묶음
        }
    }

    public static boolean validRange(int nowX, int nowY){ //올바른 땅 범위에 있는지
        if(nowX < h && nowX >= 0 && nowY < w && nowY >= 0) return true;
        else return false;
    }
}
