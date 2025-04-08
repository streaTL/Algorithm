import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String ss = br.readLine();
        for(int i=0;i<b;i++){
            String s = br.readLine();
            int x=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ss.charAt(x)){
                    x++;
                }
                if(x==ss.length())
                    break;
            }
            if(x==ss.length())
                System.out.println("true");
            else System.out.println("false");
        }
    }
}
