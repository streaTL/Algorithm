import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        int x = 999;
        for(int i=0;i<4;i++){
            int a = Integer.parseInt(br.readLine());
            res+=a;
            x=Math.min(x,a);
        }
        res-=x;
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        res+=Math.max(b,c);
        System.out.println(res);
    }
}
