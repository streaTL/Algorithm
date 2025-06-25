import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i=0;i<a;i++){
            res+=Integer.parseInt(br.readLine())-1;
        }
        System.out.println(res+1);
    }
}
