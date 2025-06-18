import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if(a==0&&b==0)
                return;
            int res=0;
            boolean x=false;
            while(a>0||b>0){
                if(!x){
                    if(a%10+b%10>=10){
                        res++;
                        a/=10;
                        b/=10;
                        x=true;
                    }
                    else{
                        a/=10;
                        b/=10;
                        x=false;
                    }
                }
                else{
                    if(a%10+b%10+1>=10){
                        res++;
                        a/=10;
                        b/=10;
                        x=true;
                    }
                    else{
                        a/=10;
                        b/=10;
                        x=false;
                    }
                }

            }
            System.out.println(res);
        }
    }
}
