import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int res=0;
        int a = Integer.parseInt(br.readLine());
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<a;i++){
            if(arr1[i]<=res){
                res = arr1[i]-1;
                System.out.print(res+" ");
            }
            else if(arr2[i]>=res){
                res = arr2[i]+1;
                System.out.print(res+" ");
            }
            else System.out.print(res+" ");
        }
        System.out.println("0");
    }
}
