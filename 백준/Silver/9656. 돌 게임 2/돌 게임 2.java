import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* SK : 상근 승, CY : 창영 승
        N==1 -> CY, N==2 -> SK, N==3 -> CY, N==4 -> SK, N==5 -> CY, N==6 -> SK
         */
        if(N % 2 == 0) System.out.println("SK");
        else System.out.println("CY");
    }
}
