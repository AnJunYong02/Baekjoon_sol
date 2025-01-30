import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while(true){
            String input = br.readLine();
            if(input.equals("0")) break;

            int blank = 2 + input.length()-1; //기본 양 옆으로 1cm 공백이므로 -> 2 + 숫자사이 1cm 공백
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) == '0') blank += 4;
                else if(input.charAt(i)=='1') blank += 2;
                else blank += 3;
            }
            sb.append(blank).append("\n");
        }
        System.out.println(sb);
    }
}
