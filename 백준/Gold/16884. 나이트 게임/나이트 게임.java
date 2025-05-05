import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int r=0;r<t;r++){
            int x = Integer.parseInt(br.readLine());
            if(x%2==1)
                System.out.println("koosaga");
            else System.out.println("cubelover");
        }
    }
}
