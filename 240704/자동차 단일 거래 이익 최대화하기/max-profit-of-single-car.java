// 풀이 아이디어

// [9, 11, 4, 5, 8, 2, 10] 에서 
// 1일차 : 처음에는 최솟값을 9로 지정
// 2일차 : 최솟값 9와 오늘 차 가격 11을 비교해서 지금 팔면 2원 이익이 될 수도 있음.
// 3일차 : 최솟값 9와 오늘 차 가격 4와 비교하니 오늘 차 가격이 더 쌈. -> 최솟값 변경
// 4일차 : 최솟값 4와 오늘 차 가격 5와 비교하니 지금 팔면 1원 이익이 될 수도 있음.
// ...
// 6일차 : 최솟값 2
// 7일차 : 최솟값 2와 오늘 차 가격 10과 비교하니 지금 팔면 8원 이익을 볼 수 있음. -> 가장 이익의 양이 크므로 정답.

// int ans = 0;
// if(min < 다음 날 차 가격) {
// 	tempAns = 다음 날 차 가격 - min; // tempAns : 하루 리셀 시 이익
// 	ans = tempAns > ans ? tempAns : ans; // ans : 자동차 리셀시 최대 이익 (정답)
// }

// else {
// 	min = 다음 날 차 가격;
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> priceList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            priceList.add(sc.nextInt());
        }

        // logic : 이익의 양을 저장해서 최대가 되는 것을 출력
        int ans = 0;
        int min = Integer.MAX_VALUE; // 구매 최소 가격
        for(int i=0; i<priceList.size(); i++) {
            // 이익의 양을 구해서 리셀시 최대 이익이면 저장해놓는다.
            if(min < priceList.get(i)) {
                int tempAns = priceList.get(i) - min; // tempAns : 하루 리셀 시 이익
                ans = tempAns > ans ? tempAns : ans; // ans : 현재 자동차 리셀시 최대 이익
            }
            // 리셀 시 오히려 손해라면 더 싼 값의 차가 있다는 것이므로 최솟값을 변경
            else {
                min = priceList.get(i);
            }
        }

        System.out.println(ans);
    }
}