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
        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int res=0;
        for(int i=a-1;i>0;i--){
            int x=0;
            int y=0;
            for(int j=0;j<=i;j++){
                if(arr[j]>x){
                    x=arr[j];
                    y=j;
                }
            }
            if(y!=i){
                int z = arr[i];
                arr[i]=x;
                arr[y]=z;
                res++;
            }
            if(res==b){
                for(int k : arr){
                    System.out.print(k+" ");
                }
                return;
            }
        }
        System.out.println(-1);
    }
}
