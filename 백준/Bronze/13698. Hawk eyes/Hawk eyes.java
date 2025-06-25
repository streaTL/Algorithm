import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[4];
        arr[0]=1;
        arr[3]=2;
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                x=arr[0];
                arr[0]=arr[1];
                arr[1]=x;
            }
            else if(s.charAt(i)=='B'){
                x=arr[0];
                arr[0]=arr[2];
                arr[2]=x;
            }
            else if(s.charAt(i)=='C'){
                x=arr[0];
                arr[0]=arr[3];
                arr[3]=x;
            }
            else if(s.charAt(i)=='D'){
                x=arr[1];
                arr[1]=arr[2];
                arr[2]=x;
            }
            else if(s.charAt(i)=='E'){
                x=arr[1];
                arr[1]=arr[3];
                arr[3]=x;
            }
            else if(s.charAt(i)=='F'){
                x=arr[2];
                arr[2]=arr[3];
                arr[3]=x;
            }
        }
        for(int i=0;i<4;i++){
            if(arr[i]==1){
                System.out.println(i+1);
                break;
            }
        }
        for(int i=0;i<4;i++){
            if(arr[i]==2){
                System.out.println(i+1);
                break;
            }
        }
    }
}
