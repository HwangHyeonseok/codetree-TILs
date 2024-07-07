import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine(); // 입력받은 문자
        char temp = s.charAt(0);
        int cnt = 1;
        StringBuilder sb = new StringBuilder(); // 정답

        for(int i=1; i<s.length(); i++) {
            // 1-A) 이전 temp 문자와 같다면 Ex) "aa"
            if(s.charAt(i) == temp) { cnt++; }
            // 1-B) 이전 temp 문자와 다르다면 Ex) "ac"
            else {
                sb.append(String.valueOf(temp)+cnt);
                temp = s.charAt(i);
                cnt = 1;
            }
        }

        // 2) 마지막 부분에 같은 경우 처리 (Ex. "aabccc" 에서 마지막 ccc는 처리가 되지 않았다.)
        if(cnt>1) {
            sb.append(String.valueOf(temp)+cnt);
        }

        System.out.println(sb.length());
        System.out.println(sb);
    }
}