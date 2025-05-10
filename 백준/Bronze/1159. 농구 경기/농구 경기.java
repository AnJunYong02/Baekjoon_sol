import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] alphabet = new int[26];

        for(int i=0; i<N; i++){
            String name = br.readLine();
            char firstChar = name.charAt(0);
            alphabet[firstChar - 'a']++;
        }

        boolean found = false;
        for(int i=0; i<26; i++){
            if(alphabet[i] >= 5){
                System.out.print((char)(i + 'a'));
                found = true;
            }
        }
        if(!found) System.out.println("PREDAJA");
    }
}
