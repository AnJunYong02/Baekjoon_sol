import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //알파벳인지 확인
            if(Character.isAlphabetic(ch)){
                if(Character.isUpperCase(ch)){//대문자라면
                    if((char)(ch+13) > 'Z') sb.append((char)(ch-13));
                    else sb.append((char)(ch+13));
                }
                else { //소문자라면
                    if((char)(ch+13) > 'z') sb.append((char)(ch-13));
                    else sb.append((char)(ch+13));
                }
            }
            else sb.append(ch);
        }

        System.out.print(sb);
    }
}
