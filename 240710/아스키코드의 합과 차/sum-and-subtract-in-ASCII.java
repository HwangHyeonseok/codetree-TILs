import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int s1 = st.nextToken().charAt(0);
        int s2 = st.nextToken().charAt(0);

        int sum = s1+s2;
        int minus = s1>s2 ? s1-s2 : s2-s1;

        bw.write(sum + " " + minus);
        bw.flush();

        // 스트림 닫기
        bw.close();
    }
}