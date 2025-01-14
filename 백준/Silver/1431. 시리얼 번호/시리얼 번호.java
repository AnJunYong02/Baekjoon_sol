import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = new String[N];

        //input 받기
        for (int i = 0; i < N; i++) input[i] = br.readLine();

        //조건에 맞게 정렬하기
        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                //1. A와 B의 길이가 다르면, 짧은 것이 먼저온다.
                if (str1.length() != str2.length())
                    return str1.length() - str2.length(); //양수면 자리 바꿈 -> str1의 길이가 더 클경우 자리바꿈

                //2. 만약 서로 길이가 같다면 => A, B의 모든 자리수 합과 비교해서 더 작은합이 먼저온다.
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < str1.length(); i++) {
                    if (isDigit(str1.charAt(i))) { //숫자라면
                        sum1 += str1.charAt(i)-'0';
                    }
                }
                for (int i = 0; i < str2.length(); i++) {
                    if (isDigit(str2.charAt(i))) { //숫자라면
                        sum2 += str2.charAt(i)-'0';
                    }
                }
                if(sum1 != sum2) return sum1 - sum2; //sum1이 더 크면 자리 바꿈

                //3. 만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
                return str1.compareTo(str2); //str2-str1 ->양수 -> str2가 알파벳이 더 큰게 있는것이므로 자리 바꾼다
            }
        });
        //
        for(String str : input){
            System.out.println(str);
        }
    }
}
