import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = (char) br.readLine().charAt(0);
        
        c = (char) (c-1);

        if(c < 'a') {
            c = 'z';
        }

        bw.write(c);
        bw.flush();
        bw.close();
        
    }
}