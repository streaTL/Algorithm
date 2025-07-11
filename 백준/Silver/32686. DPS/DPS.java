import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        double sum=0;
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            int s = x+y;
            long d = b%s;
            sum+=(c-b)/s*z;
            long e = (c-b)%s;
            while(e>0){
                if(d==s)
                    d=0;
                if(d>=x&&d<s){
                    sum+=(double)z/y;
                }
                e--;
                d++;
            }

        }
        System.out.println(sum/(c-b));
    }
}
