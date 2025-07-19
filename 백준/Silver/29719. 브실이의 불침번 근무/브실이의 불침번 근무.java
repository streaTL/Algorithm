import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long x = b;
        for(int i=1;i<a;i++){
            x*=b;
            x=x%1000000007;
        }
        long y=b-1;
        if(b!=1){
            for(int i=1;i<a;i++){
                y*=(b-1);
                y=y%1000000007;
            }
        }

        System.out.println((x-y+1000000007)%1000000007);
    }
}
