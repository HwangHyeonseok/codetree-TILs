import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 4;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[SIZE][SIZE];
        for(int i=0; i<4; i++) {
            int sum = 0;
            for(int j=0; j<4; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}