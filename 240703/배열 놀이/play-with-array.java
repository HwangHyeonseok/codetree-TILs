import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        for(int i=0; i<n; i++) {
            nums.add(sc.nextInt());
        }

        for(int i=0; i<q; i++) {
            int command = sc.nextInt();
            // a번째 원소를 출력합니다.
            if(command == 1) {
                int a = sc.nextInt();
                System.out.println(nums.get(a-1));
            }
            // n 개의 원소 중에 값이 b인 원소를 찾아, 그 원소가 몇 번째 원소인지 출력합니다.
            // 그러한 원소가 여러 개라면, 그 중에서 index가 제일 작은 원소의 것을 출력합니다.
            // 그러한 원소가 없다면, 0을 출력합니다.
            else if(command == 2) {
                boolean exist = false;
                int b = sc.nextInt();
                for(int j=0; j<nums.size(); j++) {
                    if(nums.get(j) == b) {
                        System.out.println(j+1);
                        exist = true;
                    }
                }

                if(exist == false) System.out.println(0);
            }

            // s번째 원소부터 e번째 원소까지 각 원소의 값을 공백으로 구분하여 차례대로 출력합니다.
            else if(command == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j = s-1; j <= e-1; j++) {
                    System.out.print(nums.get(j) + " ");
                }
            }

        }
    }
}