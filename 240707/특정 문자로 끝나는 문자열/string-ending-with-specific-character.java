import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int MAX_SIZE = 10;
        Scanner sc = new Scanner(System.in);
        String[] sArr = new String[MAX_SIZE];

        for(int i=0; i<MAX_SIZE; i++) {
            sArr[i] = sc.nextLine();
        }
        char c = sc.next().charAt(0);
        
        for(String s : sArr) {
            if(s.charAt(s.length()-1) == c) 
                System.out.println(s);
        }

    }
}