import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=0;tc<t;tc++){
            long a = Long.parseLong(br.readLine());
            if(a==0||a==1){
                System.out.println(2);
                continue;
            }
            while(true){
                int x = (int)Math.sqrt(a);
                boolean b=true;
                for(int i=2;i<=x;i++){
                    if(a%i==0){
                        b=false;
                        break;
                    }
                }
                if(b){
                    System.out.println(a);
                    break;
                }
                a++;
            }
        }
    }
}
