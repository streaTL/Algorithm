import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int res=0;
        for(int i=0;i<b;i++)
            res+=Integer.parseInt(st.nextToken());
        if(res>=a)
            System.out.println("Padaeng_i Happy");
        else System.out.println("Padaeng_i Cry");
    }
}
