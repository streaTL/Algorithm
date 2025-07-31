import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            arr1[i]=Integer.parseInt(st.nextToken());
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int x = arr1[m/2];
        int y = arr2[m/2];
        long res=0;
        for(int i : arr1){
            res+=Math.abs(x-i);
        }
        for(int i : arr2){
            res+=Math.abs(y-i);
        }
        System.out.println(res);
    }

}
