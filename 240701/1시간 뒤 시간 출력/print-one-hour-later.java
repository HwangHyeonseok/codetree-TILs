import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(":");
        
        int hour = Integer.parseInt(strs[0]) + 1;
        int min = Integer.parseInt(strs[1]);
        System.out.printf("%d:%d", hour, min);
    }
}