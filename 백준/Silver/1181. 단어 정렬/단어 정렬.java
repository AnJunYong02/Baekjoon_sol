import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1181
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            if(arr.contains(input)) continue;
            arr.add(input);
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){ //o1이 두번째 입력, o2가 첫번째 입력
                if(o1.length() < o2. length()) {
                    return -1; //o1의 길이가 더 짧다면 -> 자리 바꿈
                }
                else if(o1.length() > o2. length()){
                    return 1; //o1 길이 더 길면 -> 자리 그대로
                }
                else { //o1.length == o2.length 라면
                    if(o1.compareTo(o2) > 0) return 1; //o2이 사전순에 앞서있다면 -> 그대로 둠
                    else if(o1.compareTo(o2) < 0) return -1;
                    return 0;
                }
            }
        });

        for (String s : arr) System.out.println(s);
    }
}
