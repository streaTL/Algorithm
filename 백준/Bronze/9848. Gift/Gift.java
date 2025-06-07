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
        int res = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=1;i<a;i++){
            int x = Integer.parseInt(br.readLine());
            if(res-x>=b)
                sum++;
            res=x;
        }
        System.out.println(sum);
    }
}
