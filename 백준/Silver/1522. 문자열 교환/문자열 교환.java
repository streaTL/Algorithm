import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> ar = new ArrayList<>();
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                x++;
            }
        }
        int b=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            b=0;
            for(int j=0;j<x;j++){
                if(s.charAt((i+j)%s.length())=='a'){
                    b++;
                }
            }
            res = Math.max(res,b);
        }
        System.out.print(x-res);
    }
}