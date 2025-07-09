import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            char cc = c;
            if(cc>='a'){
                cc-='a'-'A';
            }
            else cc+='a'-'A';
            if(c=='*')
                return;
            boolean b =true;
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                if(s.charAt(0)!=c&&s.charAt(0)!=cc){
                    System.out.println("N");
                    b=false;
                    break;
                }
            }
            if(b)
                System.out.println("Y");
        }
    }
}
