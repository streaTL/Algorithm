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
        int c = 1;
        for(int i=2;i<=a;i++){
            c*=i;
        }
        for(int i=2;i<=a-b;i++){
            c/=i;
        }
        for(int i=2;i<=b;i++){
            c/=i;
        }
        System.out.println(c);
    }
}
