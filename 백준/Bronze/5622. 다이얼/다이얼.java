import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'D')
                a+=3;
            else if(s.charAt(i)<'G')
                a+=4;
            else if(s.charAt(i)<'J')
                a+=5;
            else if(s.charAt(i)<'M')
                a+=6;
            else if(s.charAt(i)<'P')
                a+=7;
            else if(s.charAt(i)<'T')
                a+=8;
            else if(s.charAt(i)<'W')
                a+=9;
            else
                a+=10;
        }
        System.out.println(a);
    }
}
