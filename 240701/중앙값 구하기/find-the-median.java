import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String input = sc.nextLine();
        String[] Arr = input.split(" ");
        
        for(String s : Arr) {
            list.add(Integer.parseInt(s));
        }

        // 중앙값 구하기
        Collections.sort(list); // 오름차순 정렬
        // 3->1인덱스
        System.out.println(list.get(list.size()/2));
    }
}