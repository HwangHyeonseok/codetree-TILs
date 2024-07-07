import java.util.*;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String s = sc.next();
        int q = sc.nextInt();

        for(int i=0; i<q; i++) {
            int command = sc.nextInt();

            if(command == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp = s.charAt(a-1);
                // a 인덱스와 b 인덱스가 바뀌어야 한다.
                // aba 입력 시 1 2 입력되면, aab
                if(a>b) {
                    temp = s.charAt(b-1);
                    s = s.substring(0, b-1) + s.charAt(a-1) + s.substring(b, a-1) + temp + s.substring(a); 
                }

                else if(a<b) {
                    s = s.substring(0, a-1) + s.charAt(b-1) + s.substring(a, b-1) + temp + s.substring(b);
                }
                
            }

            else if(command == 2) {
                String c = sc.next();
                String d = sc.next();
                s = s.replace(c,d);
            }
            System.out.println(s);
        }
    }
}