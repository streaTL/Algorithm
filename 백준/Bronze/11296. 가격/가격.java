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
            double d = Double.parseDouble(st.nextToken());
//            System.out.println(d);
            char c1 = st.nextToken().charAt(0);
            char c2 = st.nextToken().charAt(0);
            char c3 = st.nextToken().charAt(0);
            int x=0;
            if(c1=='R')
                x+=45;
            else if(c1=='G')
                x+=30;
            else if(c1=='B')
                x+=20;
            else if(c1=='Y')
                x+=15;
            else if(c1=='O')
                x+=10;
            else if(c1=='W')
                x+=5;
            double res=0;
            if(c2=='C'){
                res = Math.round(d*(100-x)*0.95)/100.0;
            }
            else res = Math.round(d*(100-x))/100.0;
            if(c3=='P'){
                System.out.printf("$%.2f\n",res);
            }
            else{
                if((res*100)%10>6){
                    res = Math.ceil(res*10)/10;
                    System.out.printf("$%.2f\n",res);
                }
                else{
                    res = Math.floor(res*10)/10;
                    System.out.printf("$%.2f\n",res);
                }
            }
        }
    }
}
