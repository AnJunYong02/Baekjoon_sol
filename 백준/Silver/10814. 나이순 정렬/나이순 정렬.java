import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Member> list = new ArrayList<Member>();

        for(int i=0; i<n; i++){
            int age = sc.nextInt();
            String name = sc.next();
            Member tmp_member = new Member(age, name);
            list.add(tmp_member);
        }

        list.sort((m1, m2) -> Integer.compare(m1.age, m2.age));

        for(Member member : list){
            System.out.println(member.age + " " + member.name);
        }
    }
}

class Member{
    public int age;
    public String name;

    public Member(int age, String name){
        this.age = age;
        this.name = name;
    }
}
