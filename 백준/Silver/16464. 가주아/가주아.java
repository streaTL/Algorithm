import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int e=0;e<t;e++){
            int a = Integer.parseInt(br.readLine());
            boolean b = false;

            for (long i=2;i*(i-1)/2<a;i++){
                long x=a-i*(i-1)/2;
                if(x%i==0) {
                    b=true;
                    break;
                }
            }
            System.out.println(b?"Gazua":"GoHanGang");
        }
    }

}
