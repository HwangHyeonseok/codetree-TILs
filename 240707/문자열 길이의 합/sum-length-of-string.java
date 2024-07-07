import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            String temp = sc.nextLine();
            if(temp.charAt(0) == 'a') cnt++;
            sb.append(temp);
        }

        System.out.print(sb.length() + " " + cnt);

    }
}