import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> NumToWord = new HashMap<>(); //숫자로부터 이름 알아내기
        HashMap<String, Integer> WordToNum = new HashMap<>(); //이름으로부터 숫자 알아내기

        //포켓몬 도감 만들기
        for(int i=1; i<=N; i++) {
            String pocketmonName = br.readLine();
            NumToWord.put(i, pocketmonName);
            WordToNum.put(pocketmonName, i);
        }

        //포켓몬 문제 풀기
        for(int i=0; i<M; i++) {
            String input = br.readLine();
            if(Character.isDigit(input.charAt(0))) { //숫자라면 -> 그에 해당하는 포켓몬 이름 출력
                int num = Integer.parseInt(input);
                sb.append(NumToWord.get(num)).append("\n"); //포켓몬 이름 넣기
            }
            else{ //글자라면 -> 그에 해당하는 포켓몬 숫자 출력
                sb.append(WordToNum.get(input)).append("\n");
            }
        }

        //결과 출력
        System.out.println(sb);
    }
}
