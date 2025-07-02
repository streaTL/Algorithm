import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 0;
        int res = 0;
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if(b==0){
                res = Math.max(x,res);
                x=0;
            }
            else x++;
        }
        res = Math.max(x,res);
        System.out.println(res);
    }
}
