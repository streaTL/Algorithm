import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        int x;
        int y;
        if (c % e == 0) x = c / e;
        else x = c / e + 1;
        if (b % d == 0) y = b / d;
        else y = b / d + 1;
        System.out.println(a-Math.max(x,y));
    }
}
