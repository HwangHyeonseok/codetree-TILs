import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int eeCnt = 0;
        int ebCnt = 0;
        
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == 'e') {
                if(s.charAt(i+1) == 'e') {
                    eeCnt++;
                }
                else if (s.charAt(i+1) == 'b') {
                    ebCnt++;
                }
            }
        }
        
        System.out.print(eeCnt + " " + ebCnt);
    }
}