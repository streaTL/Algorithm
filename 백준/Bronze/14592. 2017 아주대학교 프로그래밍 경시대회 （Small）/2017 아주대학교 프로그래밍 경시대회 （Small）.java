import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int x=0, y=0, z=0;
        int res=0;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(x==a){
                if(b==y){
                    if(c<z){
                        z=c;
                        res=i;
                    }
                }
                else if(b<y){
                    y=b;
                    z=c;
                    res=i;
                }
            }
            else if(x<a){
                x=a;
                y=b;
                z=c;
                res=i;
            }
        }
        System.out.println(res+1);
    }
}
