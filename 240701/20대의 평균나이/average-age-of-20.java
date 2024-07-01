import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumAge = 0; // 나이의 합
        int cnt = 0;
        while(true) {
            int inputAge = Integer.parseInt(sc.nextLine());
            if(inputAge < 20 || inputAge > 29) break;
            sumAge = sumAge + inputAge;
            cnt++;
        }

        System.out.printf("%.2f", (double)sumAge/cnt);
    }
}