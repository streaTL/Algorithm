import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if(a==0)
            System.out.println((c*c)-b);
        else if (b==0) {
            System.out.println((c*c)-a);
        }
        else System.out.println((int)Math.sqrt(a+b));
    }
}
