import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>(); //key : 책 이름, Value : 빈도수

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0)+ 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() == o2.getValue()) { //빈도수가 같다면 책 사전순으로 정렬
                    return o1.getKey().compareTo(o2.getKey()); //책 이름을 사전순으로 정렬
                }
                return o2.getValue() - o1.getValue(); //빈도수를 기준으로 내림차순으로 정렬
            }
        });

        sb.append(list.get(0).getKey());
        System.out.println(sb);

    }
}
