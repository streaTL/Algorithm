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
        int x = (b+1)*b/2;
        if(x>a){
            System.out.println(-1);
            return;
        }
        int y = (a-x)%b;
        if(y==0){
            System.out.println(b-1);
        }
        else System.out.println(b);

    }
}
