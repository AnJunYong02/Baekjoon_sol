
//11721 problem
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    String str = br.readLine();
    int N = str.length();
    String[] arr = new String[N];
    arr = str.split("");
    // int num = N / 10;

    for (int i = 0; i < N+1; i += 10) {
      for (int j = 0; j < 10; j++) {
        if(i+j == N) break;
        System.out.printf(arr[j + i]);
      }
      System.out.println("");
    }
  }
}