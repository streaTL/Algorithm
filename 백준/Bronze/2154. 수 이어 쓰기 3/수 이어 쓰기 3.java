import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder s= new StringBuilder();
        for(int i=1;i<=t;i++){
            s.append(Integer.toString(i));
        }
        System.out.println(s.indexOf(Integer.toString(t))+1);
    }
}
