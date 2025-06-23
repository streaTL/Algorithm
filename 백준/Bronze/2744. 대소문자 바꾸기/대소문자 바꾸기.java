import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'a')
                System.out.print((char)(s.charAt(i)-'A'+'a'));
            else System.out.print((char)(s.charAt(i)-'a'+'A'));
        }
    }
}
