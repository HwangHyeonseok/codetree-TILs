import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String input = sc.nextLine();
        String[] sArr = input.split(" ");

        for(String s : sArr) {
            list.add(Integer.parseInt(s));
        }

        // 합, 평균, 합-평균 구하기 // 단, a+b+c은 항상 3의 배수임을 보장
        int sum = 0; // 합
        for(int num : list) {
            sum += num;
        }
        
        System.out.println(sum);
        System.out.println(sum/list.size());
        System.out.println(sum - (sum/list.size()));
    }
}