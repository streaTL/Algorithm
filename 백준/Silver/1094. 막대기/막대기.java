import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int a = 64;
        int y=0;
        int res=0;
        while(true){
            if(y+a==x){
                res++;
                System.out.println(res);
                break;
            }
            else if(y+a>x){
                a/=2;
            }
            else{
                res++;
                y+=a;
                a/=2;
            }
        }
    }
}
