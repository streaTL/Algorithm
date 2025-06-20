import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Integer> ar = new ArrayList<>();
        for(int i=0;i<t;i++){
            String s = br.readLine();
            int a = Integer.parseInt(s);
            boolean b = false;
            for(int j=2;j<=64;j++){
                ar.clear();
                int res = a;
                while(res>=j){
                    ar.add(res%j);
                    res/=j;
                }
                ar.add(res);
                boolean bb = false;
                for(int k=0;k<ar.size();k++){
                    if(ar.get(k)!=ar.get(ar.size()-k-1)){
                        bb=true;
                        break;
                    }
                }
                if(!bb){
                    b=!b;
                    break;
                }
            }
            if(b){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
