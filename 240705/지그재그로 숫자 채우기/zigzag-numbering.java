import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nArr = new int[n][m];

        // logic 
        int inputNum = 0;
        for(int j=0; j<m; j++) {
            if(j % 2 == 0) {// j 가 짝수이면, i 가 증가하는 방향으로 값을 입힌다.
                for(int i=0; i<n; i++) {
                    nArr[i][j] = inputNum++;
                }
            }

            if(j % 2 != 0) { // j가 홀수라면, i가 감소하는 방향으로 값을 입힌다. 
                for(int i=n-1; i>=0; i--) {
                    nArr[i][j] = inputNum++;
                }
            }
        }

        // 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(nArr[i][j] + " ");
            }
            System.out.println();
        }


    }
}