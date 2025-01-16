//2720 problem
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine());
    List<Integer> list = new ArrayList<>();
    /* 

      */

    int N = Integer.parseInt(br.readLine());
    
    for(int i=2; i<=N; i++){
      if(N % i == 0){
        while(N%i==0){
          N = N/i;
          list.add(i);
        }
      }
    }

    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
