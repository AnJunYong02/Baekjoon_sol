
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int range = N - M + 1;
        String[] output = new String[range];

        Map<String, String> map = new HashMap<String, String>();
        map.put("0", "zero");
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
        map.put("6", "six");
        map.put("7", "seven");
        map.put("8", "eight");
        map.put("9", "nine");

        //배열에 범위에 해당하는 숫자들 넣기
        List<Pair> pairs = new ArrayList<>();

        for(int i=0; i<range; i++) {
            int num = M + i;
            StringBuilder sb = new StringBuilder();
            for(char ch : String.valueOf(num).toCharArray()){
                sb.append(map.get(String.valueOf(ch))).append(" ");
            }
            pairs.add(new Pair(num, sb.toString().trim()));
        }
        pairs.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.value.compareTo(p2.value);
            }
        });
//        pairs.sort(Comparator.comparing(pair -> pair.value));

        int count = 0;
        for(Pair pair : pairs) {
            System.out.print(pair.key + " ");
            count ++;
            if(count % 10 == 0) System.out.println();

        }
    }

    static class Pair {
        private int key;
        private String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
