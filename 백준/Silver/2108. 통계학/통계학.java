import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> count_map = new HashMap<>(); //최빈값 구하는 용도
        ArrayList<Integer> numbers = new ArrayList<>(); //평균, 중앙값 구하는 용도

        //1.평균 구하기
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            sum += input;
            count_map.put(input, count_map.getOrDefault(input, 0) + 1);
            numbers.add(input);
        }

        double average = Math.round((double) sum / N); //반올림
        sb.append((int) average).append("\n");

        //2. 중앙값 구하기
        //오름차순으로 숫자 sort하기
        Collections.sort(numbers);
        sb.append(numbers.get(N / 2)).append("\n");

//        if(N%2 == 0)//짝수라면 -> n/2-1번재와 n/2번째 사이값 갖고오기
//            sb.append((list.get(N/2-1).number + list.get(N/2).number) / 2).append("\n");
//        else sb.append(list.get(N/2).number).append("\n"); //홀수라면


        //3. 최빈값 출력하기
        //HashMap을 List로 변환 후 -> sort시키기
        List<Map.Entry<Integer, Integer>> count_list = new ArrayList<>(count_map.entrySet());

        //sort시키기
        //가장 빈도 높은값 가져오기, 빈도 같다면 -> 두번째로 작은 값 가져오기
        Collections.sort(count_list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue()) return o1.getKey() - o2.getKey(); //빈도수 같으면 숫자기준 오름차순으로 정렬
                return o2.getValue() - o1.getValue(); //내림차순으로 정렬 (빈도수 기준으로)
            }
        });

        //현재 count_list는 빈도수를 기준으로 내림차순으로 정렬된 상태
        int maxFrequency = count_list.get(0).getValue(); //가장 빈도수 높은 값 갖고오기
        List<Integer> outputList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> tmp_entry : count_list){
            if(tmp_entry.getValue() == maxFrequency){ //가장 높은 빈도수 값이 여러개라면 -> 리스트에 넣고 -> 거기에서 두번째 값 갖고오기
                outputList.add(tmp_entry.getKey());
            }
        }
        if(outputList.size() > 1) sb.append(outputList.get(1)).append('\n');
        else sb.append(outputList.get(0)).append('\n');




        //4. 최대값과 최솟값 차이 구하기
        int difference = numbers.get(N - 1) - numbers.get(0);
        sb.append(difference);

        System.out.println(sb);

    }

}
