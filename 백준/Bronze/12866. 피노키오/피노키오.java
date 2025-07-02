import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] arr = new int[4];
        for(int i=0;i<a;i++){
            char c = s.charAt(i);
            if(c=='A'){
                arr[0]++;
            }
            else if(c=='C'){
                arr[1]++;
            }
            else if(c=='G'){
                arr[2]++;
            }
            else if(c=='T'){
                arr[3]++;
            }
        }
        long res=1;
        for(int i : arr){
            res*=i;
            res=res%1000000007;
        }
        System.out.println(res);
    }
}
