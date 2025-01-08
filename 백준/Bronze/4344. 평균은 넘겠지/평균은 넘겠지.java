import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();//학생 수 입력
    float[] avg = new float[length];//학생들의 평균
    float[] percent = new float[length];//평균을 넘는 사람들의 퍼센트
        
    for(int i=0; i<length; i++){
      int sum = 0;
      float count = 0;
      int stu_num = sc.nextInt();
      int[] num = new int[stu_num];
      for(int j=0; j<stu_num; j++){
        num[j] = sc.nextInt();
        sum+=num[j];
      }
      avg[i] = sum / stu_num;
      for(int j=0; j<stu_num; j++){
        if(num[j] > avg[i]) count++;
      }
      percent[i] = (float)(100.0 / stu_num) * count;
    }
    for(int i=0; i<length; i++)
      System.out.printf("%.3f%%\n",percent[i]);
    
  }
}