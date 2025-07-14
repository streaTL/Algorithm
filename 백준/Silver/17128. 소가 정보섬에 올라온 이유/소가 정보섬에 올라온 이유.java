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
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[]arr2 = new int[a];
        int res=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<4;j++){
                int x = (i+j)%a;
                if(arr2[i]==0){
                    arr2[i]=arr[x];
                }
                else arr2[i]*=arr[x];
            }
        }
        for(int i : arr2){
            res+=i;
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            int c = Integer.parseInt(st.nextToken())-1;
            for(int j=0;j>-4;j--) {
                int x=0;
                if(c+j<0){
                    x=a+(c+j);
                }
                else
                    x = (c + j) % a;
                arr2[x]*=-1;
                res+=arr2[x]*2;
            }
            System.out.println(res);
        }

    }
}
