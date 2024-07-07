import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String temp = sc.nextLine();
            sb.append(temp);
        }

        int cnt = 0;
        for(int i=1; i<sb.length(); i++) {
            if(sb.charAt(i) == sb.charAt(0)) cnt++;
        }

        System.out.print(sb.length() + " " + cnt);

    }
}