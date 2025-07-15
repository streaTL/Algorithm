import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[a];
        int[] arr2 = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<a;i++){
            int x=arr[i];
            int res=1;
            for(int j=i+1;j<a;j++){
                if(arr[j]<=x){
                    x+=arr[j];
                    res++;
                }
            }
            arr2[i]=res;
        }
        Arrays.sort(arr2);
        System.out.println(arr2[a-1]);
    }
}
