import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Set<String> set = new HashSet<>();
        int count = 0; //5 +
        int length = 1;
        while(length <= str.length()){
            for(int i=0; i<str.length(); i++){
                if(i+length > str.length()) break; //글자수가 원래 글자수를 넘어간다면
                String tempStr = str.substring(i, i+length); //한글자씩 -> 두글자씩
                if(!set.contains(tempStr)){
                    set.add(tempStr);
                    count++;
                }
            }
            length++;
        }

        System.out.println(count);


    }
}
