import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] nums = s.split("-");

        int frontNum = Integer.parseInt(nums[1]);
        int backNum = Integer.parseInt(nums[2]);
        int temp = 0;
        
        temp = frontNum;
        frontNum = backNum;
        backNum = temp;

        System.out.printf("%s-%d-%d", nums[0], frontNum, backNum);

    }
}