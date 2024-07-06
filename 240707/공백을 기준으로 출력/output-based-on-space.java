import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(); // 사용할 때는 문자열처럼 똑같이 사용 가능
        sb.append(s1);
        sb.append(s2);

        // Code Tree -> CodeTree
        // for(int i=0; i<sb.length(); i++) {
        //     sb.replace(" ", "");
        // }

        // StringBuilder 에서의 replace
        // 참고 : sb.toString()은 StringBuilder 객체인 sb를 문자열로 변환하는 것이다.
        sb = new StringBuilder(sb.toString().replace(" ", ""));

        System.out.println(sb);
    }
}