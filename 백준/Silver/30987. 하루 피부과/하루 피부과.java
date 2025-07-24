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
        st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        int n4 = Integer.parseInt(st.nextToken());
        int n5 = Integer.parseInt(st.nextToken());
        int x = n2-n4;
        int y = n3-n5;

        long res1 = (long)n1*b*b*b/3+(long)x*b*b/2+(long)y*b;
        long res2 = (long)n1*a*a*a/3+(long)x*a*a/2+(long)y*a;

        long res = res1-res2;
        System.out.println(res);
    }

}
