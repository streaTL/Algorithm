import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        String s4 = st.nextToken();
        s1+=s2;
        s3+=s4;
        System.out.println(Long.parseLong(s1)+Long.parseLong(s3));
    }
}
