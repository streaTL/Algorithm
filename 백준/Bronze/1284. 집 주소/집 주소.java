import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                return;
            int res=0;
            while(a>0){
                if(a%10==0){
                    res+=4;
                } else if (a%10==1) {
                    res+=2;
                }
                else res+=3;
                a/=10;
                res++;
            }
            System.out.println(res+1);
        }
    }
}
