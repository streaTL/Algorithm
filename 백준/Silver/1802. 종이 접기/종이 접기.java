import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static boolean b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=0;tc<t;tc++){
            String s = br.readLine();
            int x = s.length()/2;
            b=true;
            dfs(0,s.length()-1,s);
            if(b)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static void dfs(int le, int ri, String s){
        int x=0;
        if(le>=ri)
            return;
        while(true){
            if(le+x>=ri-x){
                break;
            }
            if(s.charAt(le+x)==s.charAt(ri-x)){
                b=false;
                return;
            }
            x++;
        }
        dfs(le,(le+ri)/2-1,s);
        dfs((le+ri)/2+1,ri,s);
    }
}
