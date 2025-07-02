import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        boolean[] brr = new boolean[4];
        for(int i=0;i<a;i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z')
                brr[0]=true;
            else if(c>='A'&&c<='Z')
                brr[1]=true;
            else if(c>='0'&&c<='9')
                brr[2]=true;
            else brr[3]=true;
        }
        int x=0;
        for(boolean i : brr){
            if(!i)
                x++;
        }
        if(a+x>=6){
            System.out.println(x);
        }
        else System.out.println(6-a);
    }
}
