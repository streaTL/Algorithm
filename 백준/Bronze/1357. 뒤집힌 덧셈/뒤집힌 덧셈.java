import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c=0;
        int d=0;
        while(a>0){
            c*=10;
            c+=a%10;
            a/=10;
        }
        while(b>0){
            d*=10;
            d+=b%10;
            b/=10;
        }
        int e = c+d;
        int res=0;
        while(e>0){
            res*=10;
            res+=e%10;
            e/=10;
        }
        System.out.println(res);
    }
}
