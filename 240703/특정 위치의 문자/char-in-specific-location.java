import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cArr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        
        char findChar = sc.next().charAt(0); // String은 charAt(0) 접근, 배열은 인덱스로 접근 가능
        
        for(int i=0; i<cArr.length; i++) { // 리스트 : size() , 배열, 일반은 length
            if(findChar == cArr[i]) { // 문자 비교 시에는 == 가능, 문자열 비교시에는 equals
                System.out.println(i);
                return;
            }
        }

        System.out.println("None");
    }
}