import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] sArr = input.split(" ");
        
        List<Integer> list = new ArrayList<>(); // 입력받은 숫자를 담을 변수
        for(String s : sArr) {
            list.add(Integer.parseInt(s));
        }
        
        for(int i=list.get(0); i<=list.get(1); i++) {
            if(1920%i == 0 && 2880%i ==0) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}