import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = "";
        int answer = 0;

        for(int i=0; i<10; i++) {
            temp = sc.next();
            answer += temp.length();
        } 

        System.out.println(answer);
    }
}