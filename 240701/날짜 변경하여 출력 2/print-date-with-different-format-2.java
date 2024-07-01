import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArr = s.split("-");

        int month = Integer.parseInt(sArr[0]);
        int day = Integer.parseInt(sArr[1]);
        int year = Integer.parseInt(sArr[2]);

        System.out.printf("%d.%d.%d", year, month, day);
    }
}