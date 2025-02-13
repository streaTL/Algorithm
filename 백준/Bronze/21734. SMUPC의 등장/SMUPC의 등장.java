import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            while(a>0){
                int x=a%10;
                for(int j=0;j<x;j++){
                    System.out.print(s.charAt(i));
                }
                a/=10;
            }
            System.out.println();
        }
    }
}
