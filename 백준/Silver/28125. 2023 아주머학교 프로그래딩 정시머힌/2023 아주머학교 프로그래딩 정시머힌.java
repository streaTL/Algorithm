import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=0;tc<t;tc++){
            int res=0;
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='@'){
                    sb.append("a");
                    res++;
                }
                else if(s.charAt(j)=='['){
                    sb.append("c");
                    res++;
                }
                else if(s.charAt(j)=='!'){
                    sb.append("i");
                    res++;
                }
                else if(s.charAt(j)==';'){
                    sb.append("j");
                    res++;
                }
                else if(s.charAt(j)=='^'){
                    sb.append("n");
                    res++;
                }else if(s.charAt(j)=='0'){
                    sb.append("o");
                    res++;
                }else if(s.charAt(j)=='7'){
                    sb.append("t");
                    res++;
                }
                else if(s.charAt(j)=='\\'){
                    if(s.charAt(j+1)=='\\'){
                        sb.append("w");
                        j++;
                    }
                    else
                        sb.append("v");
                    j++;
                    res++;
                }
                else sb.append(s.charAt(j));
            }
            int x = sb.length()/2;
            if(sb.length()%2==1)
                x++;
            if(res<x)
                System.out.println(sb);
            else System.out.println("I don't understand");
        }
    }

}
