import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double a = 0;
        double b = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='H'){
                a++;
            }
            else if(s.charAt(i)=='P'){
                a++;
            }
            else if(s.charAt(i)=='Y'){
                a++;
            }
            else if(s.charAt(i)=='A'){
                a++;
                b++;
            }
            else if(s.charAt(i)=='S'){
                b++;
            }
            else if(s.charAt(i)=='D'){
                b++;
            }
        }
        if(a==0){
            if(b==0)
                System.out.println("50.00");
            else System.out.println("0.00");
        }
        else
            System.out.printf("%.2f",a/(a+b)*100);

    }
}
