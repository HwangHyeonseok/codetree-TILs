import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String commands = br.readLine();
        
        for(int i=0; i<commands.length(); i++) {
            char command = commands.charAt(i);
            if(command == 'L') {
                s = s.substring(1,s.length()) + s.charAt(0);
            }
            else if(command == 'R') {
                s = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
            }
        }
        
        bw.write(s);
        bw.flush();
        bw.close();
    }
}