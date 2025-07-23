import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int res=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A'||c=='a'||c=='b'||c=='D'||c=='d'||c=='e'||c=='g'||c=='O'||c=='o'||c=='P'||c=='p'||c=='Q'||c=='q'||c=='R'||c=='@')
                res++;
            else if(c=='B')
                res+=2;
        }
        System.out.println(res);
    }

}
