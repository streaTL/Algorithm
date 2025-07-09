import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            String s = br.readLine();
            int x = 0;
            int y = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='b'||s.charAt(j)=='B')
                    x++;
                else if(s.charAt(j)=='g'||s.charAt(j)=='G')
                    y++;
            }
            if(x>y)
                System.out.println(s+" is A BADDY");
            else if(y>x)
                System.out.println(s+" is GOOD");
            else System.out.println(s+" is NEUTRAL");
        }
    }
}
