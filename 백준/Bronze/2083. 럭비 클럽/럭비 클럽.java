import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            String s3 = st.nextToken();
            if(s1.equals("#"))
                break;
            System.out.print(s1+" ");
            if(Integer.parseInt(s2)>17||Integer.parseInt(s3)>=80){
                System.out.println("Senior");
            }
            else System.out.println("Junior");
        }

    }
}
