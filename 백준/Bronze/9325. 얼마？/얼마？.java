import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=0;tc<t;tc++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            for(int i=0;i<b;i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a+=x*y;
            }
            System.out.println(a);
        }
    }
}
