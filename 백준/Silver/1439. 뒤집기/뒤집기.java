import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char first = str.charAt(0);
        char currentIndex;
        int count = 0;
//        int jump_count = 0; //뛰어넘은 단어 갯수
        char prevCh;

        for (int i = 1; i < str.length(); i++) {
            currentIndex = str.charAt(i);
            prevCh = str.charAt(i-1);
            if(first != currentIndex){ //전에 숫자와 같고, 첫번째와 다르다면
                if(prevCh == currentIndex){
//                    jump_count++;
                    continue;
                }
                count++;
            }
        }

        System.out.println(count);


    }
}
