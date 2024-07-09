import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // readLine을 통해 입력 받은 한 줄의 값을 공백 단위로 데이터를 받기 위해 사용

        // 입력
        String s = st.nextToken();
        int q = Integer.parseInt(st.nextToken());

        for(int i=0; i<q; i++) {
            int command = Integer.parseInt(br.readLine());
            if(command == 1) {
                s = s.substring(1,s.length()) + s.charAt(0);
            }
            else if(command == 2) {
                s = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
            }
            else if(command == 3) {
                StringBuffer sb = new StringBuffer(s);
                s = sb.reverse().toString();
            }

            bw.write(s + "\n");
            bw.flush();
        }


        bw.close();
    }
}