import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        // logic : 내림차순 정렬 후 [0], [1] 출력
        Collections.sort(list,Collections.reverseOrder());

        System.out.printf("%d %d", list.get(0), list.get(1));
    }
}