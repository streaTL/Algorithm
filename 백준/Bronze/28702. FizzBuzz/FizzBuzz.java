import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int x=0;
        if(s1.charAt(0)<'A'){
            x=Integer.parseInt(s1)+3;
        }
        else if(s2.charAt(0)<'A'){
            x=Integer.parseInt(s2)+2;
        }
        else if(s3.charAt(0)<'A'){
            x=Integer.parseInt(s3)+1;
        }
        if(x%3==0&&x%5==0){
            System.out.println("FizzBuzz");
        }
        else if(x%3==0)
            System.out.print("Fizz");
        else if(x%5==0)
            System.out.print("Buzz");
        else System.out.println(x);
    }
}
