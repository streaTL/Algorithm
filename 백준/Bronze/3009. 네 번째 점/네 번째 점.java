import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a3 = Integer.parseInt(st.nextToken());
        int b3 = Integer.parseInt(st.nextToken());
        if(a==a2)
            System.out.print(a3+" ");
        else if(a==a3)
            System.out.print(a2+" ");
        else if(a2==a3)
            System.out.print(a+" ");
        if(b==b2)
            System.out.print(b3);
        else if(b==b3)
            System.out.print(b2);
        else if(b2==b3)
            System.out.print(b);
    }
}
