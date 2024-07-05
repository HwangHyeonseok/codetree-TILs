import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 4;
        int[][] numArr = new int[SIZE][SIZE];
        
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                numArr[i][j] = sc.nextInt();            
            }
        }

        // logic : j-i 가 0보다 크다면 더하지 않는다.
        int ans = 0;
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if(j-i > 0) continue;
                else {
                    ans += numArr[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}