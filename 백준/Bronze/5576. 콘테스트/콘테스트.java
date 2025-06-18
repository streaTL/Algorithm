import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];
        for(int i=0;i<10;i++){
            ar1[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++){
            ar2[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(ar1[9]+ar1[8]+ar1[7]+" "+(ar2[9]+ar2[8]+ar2[7]));
    }
}
