import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            int x = Integer.parseInt(br.readLine());
            if(x>=40)
                arr[i]=x;
            else arr[i]=40;
        }
        int res=0;
        for(int i:arr)
            res+=i;
        System.out.println(res/5);
    }
}
