import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int X=s.nextInt();
    for(int i=0;i<N;i++){
      int A=s.nextInt();
      if(A<X) System.out.print(A+" ");
    }
  }
}