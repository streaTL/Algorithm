import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int res = 0;
        for(int i=0;i<s.length();i++){
            res = (res*10+s.charAt(i)-'0')%20000303;
        }
        System.out.println(res);
    }
}
