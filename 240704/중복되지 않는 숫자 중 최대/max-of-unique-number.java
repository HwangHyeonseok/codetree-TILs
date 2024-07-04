import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_N = 1001; // 최대 N의 값
        int[] numArr = new int[MAX_N];
        List<Integer> list = new ArrayList<>(); // 1번만 등장한 숫자

        int n = Integer.parseInt(sc.nextLine());

        // logic : 입력받은 숫자 빈도수를 numArr 배열에 저장
        for(int i=0; i<n; i++) {
            int input = sc.nextInt();
            numArr[input]++;
        }

        // logic : 빈도수가 1인 것만 list에 담는다.
        for(int i=1; i<MAX_N; i++) {
            if(numArr[i] == 1) {
                list.add(i);
            }
        }

        // logic case1 : 만약 1번만 나온 수가 없는 경우 -> -1 출력 후 프로그램 종료
        if(list.isEmpty()) {
            System.out.println(-1);
            return;
        }
        // logic case2 : 내림차순 정렬을 하여 [0] 인덱스를 출력
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(0));
        
    }
}