import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][a];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int[] ar = new int[a];
        for(int i=0;i<a;i++){
            int x=0;
            for(int j=0;j<a;j++){
                if(i==j)
                    continue;
                x|=arr[i][j];
            }
            ar[i]=x;
        }
        for(int i=0;i<a;i++){
            System.out.print((ar[i]&ar[i])+" ");
        }
    }
}
