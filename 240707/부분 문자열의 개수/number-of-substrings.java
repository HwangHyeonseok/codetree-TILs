import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer=  0;

        String s = sc.nextLine();
        String sFind = sc.nextLine();

        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == sFind.charAt(0) && s.charAt(i+1) == sFind.charAt(1)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}