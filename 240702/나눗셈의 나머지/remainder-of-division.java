import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int MAXLEFT = 1000; // 나올 수 있는 나머지의 최댓값 : 1000 이라고 가정
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        Integer[] divideLeft = new Integer[MAXLEFT]; // 나머지 횟수를 저장
        Arrays.fill(divideLeft,0);

        // 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 로직 수행
        while(a > 1) { // "1 이하가 되기 전까지"
            divideLeft[a % b]++;
            a = a / b;
        }

        // 나머지가 나온 횟수의 제곱 합 구하기
        for(int i=0; i<MAXLEFT; i++) {
            answer += divideLeft[i]*divideLeft[i];
        }

        System.out.println(answer);
    }
}