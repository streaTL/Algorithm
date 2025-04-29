import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x;
        StringBuilder sb = new StringBuilder();
        while((x=Integer.parseInt(br.readLine()))!=0){
            for(int i=1;i<=x;i++){
                sb.append("*");
                System.out.println(sb);
            }
            sb = new StringBuilder();
        }
    }
}
