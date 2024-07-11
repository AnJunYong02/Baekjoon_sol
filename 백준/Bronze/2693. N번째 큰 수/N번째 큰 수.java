import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }
            main.find_result(arr);
        }
    }

    void find_result(int[] num) {
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > first) {
                third = second;
                second = first;
                first = num[i];
            } 
            else if (num[i] > second) {
                third = second;
                second = num[i];
            } 
            else if (num[i] > third) {
                third = num[i];
            }
        }
        System.out.println(third);
    }
}
