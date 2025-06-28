import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int a = arr[2];
        while(true){
            int x=0;
            for(int i : arr){
                if(a%i==0)
                    x++;
            }
            if(x>=3)
                break;
            a++;
        }
        System.out.println(a);
    }
}
