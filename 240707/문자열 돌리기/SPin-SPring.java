import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for(int i=0; i<s.length()+1; i++) {
            if(i == 0) {
                System.out.println(s);
                continue;
            }
            s = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
            System.out.println(s);
        }
        
    }
}