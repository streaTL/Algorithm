import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        a-=a%100;
        if(a%b!=0)
            a+=b-a%b;
        int x = a%10;
        a/=10;
        int y=a%10;
        System.out.print(y);
        System.out.print(x);
    }
}
