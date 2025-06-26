import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[9];
        int[] arr2 = new int[9];
        for(int i=0;i<9;i++){
            arr1[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
        int x = 0;
        int y = 0;
        for(int i=0;i<9;i++){
            x+=arr1[i];
            if(x>y){
                System.out.println("Yes");
                return;
            }
            y+=arr2[i];
        }
        System.out.println("No");

    }
}
