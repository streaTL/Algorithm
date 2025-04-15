import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("AKARAKA");
        for(int i=1;i<a;i++){
            sb.append("RAKA");
        }
        System.out.println(sb);
    }
}
