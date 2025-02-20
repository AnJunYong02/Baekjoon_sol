import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<Member> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            Member member = new Member(st.nextToken(), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            list.add(member);
        }

        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.korea == o2.korea) {
                    if(o1.english == o2.english){ //국어, 영어 점수 같다면
                        if(o1.math == o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math; //내림차순 정렬
                    }
                    //국어 점수 같다면
                    return o1.english - o2.english; //오름차순 정렬
                }
                return o2.korea - o1.korea; //내림차순 정렬
            }});

        for (Member member : list) System.out.println(member.name);
    }

    static class Member{
        String name;
        int korea;
        int english;
        int math;

        public Member(String name, int korea, int english, int math) {
            this.name = name;
            this.korea = korea;
            this.english = english;
            this.math = math;
        }
    }
}
