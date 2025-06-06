import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        b+=a;
        if(b>=5){
            System.out.println("yt");
            return;
        }
        a+=b;
        if(a>=5){
            System.out.println("yj");
            return;
        }
        b+=a;
        if(b>=5){
            System.out.println("yt");
            return;
        }
        a+=b;
        if(a>=5){
            System.out.println("yj");
            return;
        }
        b+=a;
        if(b>=5){
            System.out.println("yt");
            return;
        }
    }
}
