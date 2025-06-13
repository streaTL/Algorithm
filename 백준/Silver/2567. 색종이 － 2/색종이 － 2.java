import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a;j<a+10;j++){
                for(int k=b;k<b+10;k++){
                    arr[j][k]=true;
                }
            }
        }
        int[] xx = new int[]{0,0,1,-1};
        int[] yy = new int[]{1,-1,0,0};
        int res=0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j]){
                    for(int k=0;k<4;k++){
                        int xxx = i+xx[k];
                        int yyy = j+yy[k];
                        if(xxx<0||xxx>=100||yyy<0||yyy>=100||!arr[xxx][yyy]){
                            res++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
