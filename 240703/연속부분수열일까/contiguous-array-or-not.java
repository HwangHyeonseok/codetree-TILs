import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aSize = sc.nextInt();
        int bSize = sc.nextInt();

        int[] aArr = new int[aSize];
        int[] bArr = new int[bSize];

        for(int start=0; start<=aSize-bSize; start++) { // 시작점부터 순회하면서 부분문자수열인지 검사
            // 부분문자수열 검사 로직
            int bArrIndex = 0; // bArr와 연속으로 똑같은 원소의 갯수
            for(int check=start; check<start+bSize; check++) {
                if(bArr[bArrIndex] == aArr[check]) {
                    bArrIndex++;
                }
                else { break; }
            }
            
            if(bSize == bArrIndex) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}