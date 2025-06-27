import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=0;tc<t;tc++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while(a!=b){
                if(a>b){
                    if(a%2==1){
                        a=(a-1)/2;
                    }
                    else a/=2;
                }
                else{
                    if(b%2==1){
                        b=(b-1)/2;
                    }
                    else b/=2;
                }
            }
            System.out.println(10*a);
        }
    }
}
