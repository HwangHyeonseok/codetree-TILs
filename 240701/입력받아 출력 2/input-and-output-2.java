import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] nums = s.split("-");
        
        for(String num : nums) {
            System.out.print(num);
        }
    }
}