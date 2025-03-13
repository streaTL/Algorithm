import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long res=0;
        long x=0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())==1){
                x++;
                res+=x;
            }
            else{
                x--;
                res+=x;
            }
        }
        System.out.println(res);
    }
}
