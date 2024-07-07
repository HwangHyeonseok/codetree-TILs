import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char firstWord = s.charAt(0);
        char secondWord = s.charAt(1);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == firstWord) {
                sb.append(secondWord);
            }
            else if(s.charAt(i) == secondWord) {
                sb.append(firstWord);
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);

        

    }
}