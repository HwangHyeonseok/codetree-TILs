import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nArr1 = new int[n][m];
        int[][] nArr2 = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                nArr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                nArr2[i][j] = sc.nextInt();
            }
        }

        // logic : 같으면 0, 다르면 1
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(nArr1[i][j] == nArr2[i][j]) {
                 System.out.print(0 + " ");   
                }
                else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }


    }
}