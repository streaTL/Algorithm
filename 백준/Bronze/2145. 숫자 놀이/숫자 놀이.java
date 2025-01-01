import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int a=Integer.parseInt(br.readLine());
            if(a==0)
                break;
            int x=100;
            while(x>=10){
                x=0;
                while(a>0){
                    x+=a%10;
                    a/=10;
                }
                a=x;
            }
            System.out.println(x);
        }
    }
}
