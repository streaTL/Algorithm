import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a+2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long res=0;
        for(int i=1;i<=a+1;i++){
            res+=Math.abs(arr[i-1]-arr[i]);
            res+=2*arr[i];
        }
        res+=2*a;
        System.out.println(res);
    }
}
