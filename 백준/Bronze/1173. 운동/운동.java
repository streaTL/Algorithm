import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int a3 = Integer.parseInt(st.nextToken());
        int a4 = Integer.parseInt(st.nextToken());
        int a5 = Integer.parseInt(st.nextToken());
        int x=0;
        int res=0;
        int y=a2;
        while(x!=a1){
            if(y+a4<=a3){
                y+=a4;
                x++;
                res++;
            }
            else{
                if(y==a2){
                    System.out.println(-1);
                    return;
                }
                if(y-a5<a2){
                    y=a2;
                }
                else{
                    y-=a5;
                }
                res++;
            }
        }
        System.out.println(res);
    }

}
