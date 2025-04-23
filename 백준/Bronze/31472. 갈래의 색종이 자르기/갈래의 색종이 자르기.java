import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = (Integer.parseInt(br.readLine())*2);
        int res = (int)Math.sqrt(a)*4;
        System.out.println(res);
    }
}
