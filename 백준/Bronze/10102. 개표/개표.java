import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int x=0;
        int y=0;
        for(int i=0;i<a;i++){
            if(s.charAt(i)=='A')
                x++;
            else y++;
        }
        if(x>y)
            System.out.println("A");
        else if (x==y) {
            System.out.println("Tie");
        }
        else System.out.println("B");
    }
}
