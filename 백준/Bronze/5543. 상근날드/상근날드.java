import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int res=0;
        if(a>=b){
            if(b<=c)
                res+=b;
            else res+=c;
        }
        else{
            if(a<=c)
                res+=a;
            else res+=c;
        }
        if(x>=y)
            res+=y;
        else res+=x;
        System.out.println(res-50);
    }
}
