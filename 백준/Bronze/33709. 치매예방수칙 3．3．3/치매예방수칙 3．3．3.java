import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int x=0;
        int res=0;
        for(int i=0;i<t;i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                if(x==i){
                    x++;
                }
                else{
                    res+=Integer.parseInt(s.substring(x,i));
                    x=i+1;
                }
            }
        }
        if(x<t)
            res+=Integer.parseInt(s.substring(x,s.length()));
        System.out.println(res);
    }
}
