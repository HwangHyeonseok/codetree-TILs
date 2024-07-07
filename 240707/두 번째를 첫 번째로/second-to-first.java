import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char changeFind = s.charAt(1);
        char changeWord = s.charAt(0);

        s = s.replace(changeFind, changeWord);

        System.out.println(s);
    }
}