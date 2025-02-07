import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = (int)Math.sqrt(a);
        if(c*c!=a)
            c++;
        int d = (int)Math.sqrt(b);
        int res=0;
        int res2=c*c;
        for(int i=c;i<=d;i++){
            res+=i*i;
        }
        if(res==0)
            System.out.println(-1);
        else{
            System.out.println(res);
            System.out.println(res2);
        }
    }
}
