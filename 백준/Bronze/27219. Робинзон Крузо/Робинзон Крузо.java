import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a/5;i++){
            System.out.print("V");
        }
        for(int i=0;i<a%5;i++){
            System.out.print("I");
        }
    }
}
