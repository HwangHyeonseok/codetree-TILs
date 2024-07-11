import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String ans = "";
        String s = br.readLine();
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                ans += s.charAt(i);
            }
        }
        
        // 문자열을 대문자로 변환해서 출력
        bw.write(ans.toUpperCase());
        bw.flush();
        bw.close();

    }
}