import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int x = (int)Math.sqrt(a)+1;
        int y = x-1;
        int res=0;
        while(true){
            if(Math.pow(x,2)-Math.pow(y,2)==a){
                System.out.println(x);
                res++;
                x++;
            }
            else if(Math.pow(x,2)-Math.pow(y,2)<a){
                if(Math.pow(x,2)-Math.pow(y-1,2)>a){
                    x++;
                }
                else
                    y--;
            }
            else if(Math.pow(x,2)-Math.pow(y,2)>a){
                if(y<x-1){
                    y++;
                }
                else
                    x++;
            }
            if(Math.pow(x,2)-Math.pow(x-1,2)>a)
                break;
        }
        if(res==0)
            System.out.println(-1);
    }
}
