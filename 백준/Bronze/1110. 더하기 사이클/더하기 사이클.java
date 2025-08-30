import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int res=1;
        int b = a;
        b = (b/10+b%10)%10+(b%10)*10;
        if(b==a){
            System.out.println(res);
            return;
        }
        while(b!=a){
            b = (b/10+b%10)%10+(b%10)*10;
            res++;
        }
        System.out.println(res);
    }
}
