import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size1 = Integer.parseInt(st.nextToken());
        int size2 = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        //A, B 원소 넣기
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<size1; i++) setA.add(Integer.parseInt(st.nextToken()));
        st  = new StringTokenizer(br.readLine());
        for(int i=0; i<size2; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(setA.contains(temp)) continue;
            setB.add(temp);
        }

        //차집합구하기
        int countB = setB.size();
        int dupCount = size2 - countB;

        //출력하기
        System.out.println(size1-dupCount + countB);
    }
}
