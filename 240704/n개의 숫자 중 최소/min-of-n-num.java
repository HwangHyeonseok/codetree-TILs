import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        // logic : 최솟값 구하기
        int minNum = Integer.MAX_VALUE;

        for(int i=0; i<list.size(); i++) {
            minNum = list.get(i) < minNum ? list.get(i) : minNum;
        }

        // logic : 최솟값에 해당하는 원소 개수 세기
        int minCnt = 0;
        for(int i=0; i<list.size(); i++) {
            if(minNum == list.get(i)) minCnt++;
        }
        
        // 정답 출력
        System.out.printf("%d %d", minNum, minCnt);
    }
}