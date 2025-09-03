import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a==-1){
                System.out.println(res);
                return;
            }
            res+=a;
        }
    }
}
