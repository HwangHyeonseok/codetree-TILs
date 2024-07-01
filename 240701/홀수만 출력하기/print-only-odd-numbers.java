import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i=0; i<N; i++) {
            int testNum = Integer.parseInt(sc.nextLine());
            if(testNum % 2 == 0) continue; // 짝수인 경우 
            if(testNum % 3 != 0) continue; // 3의 배수가 아닌 경우
            System.out.println(testNum); 
        }
    }
}