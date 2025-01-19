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
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        long res=0;
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            ar1.add(s1.charAt(i)-'0');
        }
        for(int i=0;i<s2.length();i++){
            ar2.add(s2.charAt(i)-'0');
        }
        for(int i:ar1){
            for(int j:ar2)
                res+=i*j;
        }
        System.out.println(res);
    }
}
