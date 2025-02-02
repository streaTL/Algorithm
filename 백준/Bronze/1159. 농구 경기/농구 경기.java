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
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[27];
        for(int i=0;i<a;i++){
            String s = br.readLine();
            arr[s.charAt(0)-'a']++;
        }
        int x=0;
        for(int i=0;i<27;i++){
            char c = (char) (i+'a');
            if(arr[i]>=5){
                System.out.print(c);
                x++;
            }
        }
        if(x==0)
            System.out.println("PREDAJA");
    }
}
