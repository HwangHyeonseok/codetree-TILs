import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] Arr = s.split(" ");
        for(String s1 : Arr) {
            list.add(Integer.parseInt(s1));
        }

        System.out.printf("%.2f", (double)(list.get(0)+list.get(1)) / (double)(list.get(0)-list.get(1)));
    }
}