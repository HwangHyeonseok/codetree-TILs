import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // 참고 : java에서 substring은 음수 사용 시 오류가 발생한다.
        s = s.substring(0,1) + "a" + s.substring(2,s.length()-2) + "a" + s.substring(s.length()-1);
        System.out.println(s);
    }
}