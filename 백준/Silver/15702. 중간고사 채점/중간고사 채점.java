import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        int x=99999;
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int res=0;
            for(int j=0;j<a;j++){
                if(st.nextToken().charAt(0)=='O'){
                    res+=arr1[j];
                }
            }
            if(res>sum){
                sum=res;
                x=c;
            }
            else if(res==sum){
                if(c<x)
                    x=c;
            }
        }
        System.out.println(x+" "+sum);
    }
}
