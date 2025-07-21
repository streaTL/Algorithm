import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int[]arr;
    static int res=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        dfs(0,b,0);
        System.out.println(res);
    }
    static void dfs(int a, int b, int c){
        if(a==b&&c>0){
            res++;
        }
        for(int i=c;i<arr.length;i++){
            dfs(a+arr[i],b,i+1);
        }
    }
}
