import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int SIZE = 5;
        char[] cArr = new char[SIZE];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<SIZE; i++){
            int inputNum = Integer.parseInt(st.nextToken());
            cArr[i] = (char) inputNum;
        }

        for(int i=0; i<SIZE; i++) {
            bw.write(cArr[i]+" ");
            bw.flush();
        }

        bw.close();
    }
}