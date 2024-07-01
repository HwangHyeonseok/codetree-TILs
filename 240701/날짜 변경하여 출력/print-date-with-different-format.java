import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] nums = s.split("\\.");
        int year = Integer.parseInt(nums[0]);
        int month = Integer.parseInt(nums[1]);
        int day = Integer.parseInt(nums[2]);
        
        System.out.printf("%d-%d-%d", month, day, year);
    }
}