import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = a;
        long res = Long.parseLong(a);
        a = a.charAt(a.length()-1)+a.substring(0,a.length()-1);
        while(!a.equals(b)){
            res+=Long.parseLong(a);
            a = a.charAt(a.length()-1)+a.substring(0,a.length()-1);
        }
        System.out.println(res);
    }
}
