import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int ans = Integer.MIN_VALUE; // 초기에는 최솟값으로 세팅

        // logic : 가장 큰 수를 고르는 로직
        for(int i=0; i<SIZE; i++) {
            int inputNum = sc.nextInt();
            ans = inputNum > ans ? inputNum : ans;
        }

        System.out.println(ans);
    }
}