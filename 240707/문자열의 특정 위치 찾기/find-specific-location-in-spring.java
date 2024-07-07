import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // String c = sc.next(); // 이것도 가능 
        char c = sc.next().charAt(0); 

        System.out.println(s.indexOf(c));
    }
}