import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cr = new char[]{'a','e','i','o','u'};
        while(true){
            String s = br.readLine();
            if(s.equals("#"))
                return;
            int x = s.length();
            int z=0;
            for(int j=0;j<x;j++){
                char c = s.charAt(0);
                for(int i=0;i<5;i++) {
                    if (c == cr[i]) {
                        s += "ay";
                        System.out.println(s);
                        z=1;
                    }
                    if(z==1)
                        break;
                }
                s=s.substring(1);
                s+=c;
                if(z==1)
                    break;
                if(j==x-1)
                    System.out.println(s+"ay");
            }
        }
    }
}
