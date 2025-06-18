import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[26];
        int res=0;
        int sum=0;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==-1){
                System.out.println(sum+" "+res);
                return;
            }
            char c = st.nextToken().charAt(0);
            String s = st.nextToken();
            if(s.equals("wrong")){
                arr[c-'A']++;
            }
            else {
                sum++;
                res+=a+20*arr[c-'A'];
            }
        }
    }
}
