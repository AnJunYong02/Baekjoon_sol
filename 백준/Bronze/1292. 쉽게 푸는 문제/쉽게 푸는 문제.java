
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[1000000];
        int start = sc.nextInt();
        int end = sc.nextInt();
        int total = 0;
        int count = 1;

        for(int i=1; i<=1000; i++){
            int index = count;
            for(int j=0; j<i; j++){
                num[index-1] = i;
                index++;
                count++;
            }
        }
        //start = 3, end = 7
        for(int i=start; i<=end; i++)//num[2] num[3] num[4] num[5] num[6]
            total += num[i-1];
        System.out.println(total);
    }

}
