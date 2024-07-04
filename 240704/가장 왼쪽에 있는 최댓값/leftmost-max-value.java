// 풀이 전략
// int index = list.size();
// while(왼쪽 끝) {
// 1) [0~index-1]까지 최댓값 찾기 (n)
// 2) 순회를 마치고 최댓값 위치 찾기위해 다시 순회 (n) -> 최댓값 위치 index에 저장
// 3) 최댓값에 해당하는 인덱스 출력
// System.out.print(index + " ");
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        // 입력
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        int index = list.size();
        while(index != 0) {
            //1) [0~index-1]까지 최댓값 찾기 O(n)
            int maxNum = Integer.MIN_VALUE;
            for(int i=0; i<index; i++) {
                maxNum = list.get(i) > maxNum ? list.get(i) : maxNum;
            }
            // 2) 순회를 마치고 최댓값 위치 찾기위해 다시 순회 (n) -> 최댓값 위치 index에 저장
            for(int i=0; i<index; i++) {
                if(list.get(i) == maxNum) {
                    index = i;
                    break;
                }
            }
            
            // 3) 최댓값에 해당하는 인덱스 출력
            System.out.print((index+1) + " ");
        }
    }
}