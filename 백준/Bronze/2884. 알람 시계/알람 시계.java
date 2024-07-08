import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int H=s.nextInt();
    int M=s.nextInt();
    int new_H=0,new_M=0;
    if(M<45){
      if(H<1){
        new_M=15+M;
        new_H=23;
      }
      else{
      new_M=15+M;
      new_H=H-1;        
      }
    }
    else{
      new_M=M-45;
      new_H=H;
    }
    System.out.print(new_H+" "+new_M);
    }
  }