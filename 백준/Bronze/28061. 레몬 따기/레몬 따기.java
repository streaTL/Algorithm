import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res=0;
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            res=Math.max(x-a,res);
            a--;
        }
        System.out.println(res);
    }
}
