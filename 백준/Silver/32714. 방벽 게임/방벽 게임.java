import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a==2)
            System.out.println(1);
        else if(a==3)
            System.out.println(3);
        else{
            System.out.println((2*a)-1+a-3);
        }
    }

}
