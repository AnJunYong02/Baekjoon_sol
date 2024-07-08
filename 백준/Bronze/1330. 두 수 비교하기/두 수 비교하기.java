import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num1=s.nextInt();
    int num2=s.nextInt();
    if(num1>num2) System.out.println(">");
    else if(num1<num2) System.out.println("<");
    else if(num1==num2) System.out.println("==");
  }
}