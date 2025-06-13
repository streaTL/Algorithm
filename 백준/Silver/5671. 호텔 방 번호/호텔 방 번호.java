import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[] brr = new boolean[10];
        String s;
        while((s = br.readLine())!=null&&!s.isEmpty()){
            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int res=0;
            for(int i=a;i<=b;i++){
                int x=i;
                Arrays.fill(brr,false);
                while(x>0){
                    if(brr[x%10]==true){
                        break;
                    }
                    brr[x%10]=true;
                    x/=10;
                }
                if(x==0)
                    res++;
            }
            System.out.println(res);
        }
    }
}
