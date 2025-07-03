import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("2");
        List<BigInteger> ar = new ArrayList<>();
        ar.add(x);
        ar.add(y);
        while(true){
            BigInteger z = x.add(y);
            ar.add(z);
            x=y;
            y=z;
            if(y.compareTo(new BigInteger("10").pow(100))>0){
                break;
            }
        }
        while(true){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            if(s1.equals("0")&&s2.equals("0")){
                break;
            }
            int res=0;
            for(BigInteger i :ar){
                if(a.compareTo(i)<=0&&b.compareTo(i)>=0){
                    res++;
                }
            }
            System.out.println(res);
        }

    }
}
