import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        x+=Integer.parseInt(br.readLine());
        x+=Integer.parseInt(br.readLine())*2;
        x+=Integer.parseInt(br.readLine())*3;
        System.out.println(x>=10?"happy":"sad");
    }
}
