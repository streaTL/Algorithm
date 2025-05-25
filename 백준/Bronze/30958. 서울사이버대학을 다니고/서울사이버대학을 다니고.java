import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String s = br.readLine();
        int res = 0;
        int[] arr = new int[27];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                arr[s.charAt(i)-'a']++;
            }
        }
        for(int i : arr)
            res = Math.max(res,i);
        System.out.println(res);
    }
}
