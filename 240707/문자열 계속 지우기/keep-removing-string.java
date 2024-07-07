import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String find = sc.nextLine();
        while(s.contains(find)) {
            s = s.replace(find, "");
        }

        System.out.println(s);
    }
}