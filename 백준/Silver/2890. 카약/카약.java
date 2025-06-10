import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[][] arr = new int[10][2];
        for(int i=0;i<10;i++)
            arr[i][0]=i;
        for(int i=0;i<a;i++){
            String s = br.readLine();
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)<='9'&&s.charAt(j)>='0'){
                    arr[s.charAt(j)-'0'][1]=j;
                    break;
                }
            }
        }
        Arrays.sort(arr,(x,y)->y[1]-x[1]);
        int x=0;
        int res=0;
        int[] arr2 = new int[10];
        for(int i=0;i<9;i++){
            if(arr[i][1]==x){
                arr2[arr[i][0]]=res;
            }
            else{
                arr2[arr[i][0]]=++res;
                x=arr[i][1];
            }
        }
        for(int i=1;i<=9;i++){
            System.out.println(arr2[i]);
        }
    }
}
