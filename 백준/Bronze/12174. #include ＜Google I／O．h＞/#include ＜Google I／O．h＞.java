import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=t;i++){
            sb.append("Case #"+i+": ");
            int a = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int x=0;
            int y=8;
            for(int k=1;k<=a;k++){
                int z=7;
                char c=0;
                for(int j=x;j<y;j++,z--){
                    if(s.charAt(j)=='I'){
                        c+=Math.pow(2,z);
                    }
                }
                sb.append(c);
                x+=8;
                y+=8;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
