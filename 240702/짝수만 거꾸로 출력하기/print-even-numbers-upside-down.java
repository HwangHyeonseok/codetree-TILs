import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        for(int i=list.size()-1; i>=0; i--) {
            if(list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}