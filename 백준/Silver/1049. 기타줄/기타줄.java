import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]); // 필요한 기타줄 개수
        int M = Integer.parseInt(str[1]); // 주어진 브랜드 개수
        int[] setPrice = new int[M];
        int[] perPrice = new int[M];

        // 브랜드별 기타줄 가격 입력
        for (int i = 0; i < M; i++) {
            String[] tmp_str = br.readLine().split(" ");
            setPrice[i] = Integer.parseInt(tmp_str[0]);
            perPrice[i] = Integer.parseInt(tmp_str[1]);
        }

        // 세트, 낱개별 최저가 찾기
        Arrays.sort(setPrice); // 세트 가격 오름차순 정렬
        Arrays.sort(perPrice); // 낱개 가격 오름차순 정렬

        // 세트로만 구매하는 경우
        int setOnlyPrice = ((N / 6) + 1) * setPrice[0];

        // 세트와 낱개 조합으로 구매하는 경우
        int setAndPiecePrice = (N / 6) * setPrice[0] + (N % 6) * perPrice[0];

        // 낱개로만 구매하는 경우
        int pieceOnlyPrice = N * perPrice[0];

        // 최저가 결정
        int price = Math.min(setOnlyPrice, Math.min(setAndPiecePrice, pieceOnlyPrice));

        System.out.print(price);
    }
}
