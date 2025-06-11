import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int b=0;
        StringBuilder sb = new StringBuilder();
        while(true){
            b=0;
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            int a4 = Integer.parseInt(st.nextToken());
            int x1 = a1;
            int x2 = a2;
            int x3 = a3;
            int x4 = a4;
            if(a1==0&&a2==0&&a3==0&&a4==0){
                System.out.println(sb);
                break;
            }
            while(true){
                a1=x1;
                a2=x2;
                a3=x3;
                a4=x4;
                if(a1==a2&&a2==a3&&a3==a4){
                    sb.append(b+"\n");
                    break;
                }
                else{
                    b++;
                    x1=Math.abs(a1-a2);
                    x2=Math.abs(a2-a3);
                    x3=Math.abs(a3-a4);
                    x4=Math.abs(a4-a1);
                }
            }
        }
    }
}
