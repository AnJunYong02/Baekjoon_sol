//2490 problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] output = new String[3];
    // System.out.println("\nstr[0] = " + str[0]);
    // System.out.println("\nstr[1] = " + str[1]);
    for(int i=0; i<3; i++){
      int count = 0;
      String[] str = br.readLine().split(" ");
      for (int j = 0; j < 4; j++){
        if (str[j].equals("0")) {
          count++;
        }
      }
      if (count == 1)
        output[i] = "A";
      else if (count == 2)
        output[i] = "B";
      else if (count == 3)
        output[i] = "C";
      else if (count == 4)
        output[i] = "D";
      else
        output[i] = "E";
    }

    for (int i = 0; i < 3; i++)
      System.out.println(output[i]);
  }
}