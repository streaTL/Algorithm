import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int y=0;
        int x=s.length()%3;

        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            if(i==s.length()-1)
                break;
            if((i+1)%3==x)
                System.out.print(",");
        }

    }
}
