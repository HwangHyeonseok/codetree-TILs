import java.util.*;

public class Main {
    public static void main(String[] args) {
        int cnt = 0; // ans
        // 입력
        Scanner sc= new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        // 로직
        for(int num : list) {
            if(num == m) cnt++;
        }

        // 출력
        System.out.println(cnt);
    }
}