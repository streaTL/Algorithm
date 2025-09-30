import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x=0;
        int y=0;
        while(st.hasMoreTokens()){
            int b = Integer.parseInt(st.nextToken());
            x+=((b/30)+1)*10;
            y+=((b/60)+1)*15;
        }
        if(x==y)
            System.out.println("Y M "+x);
        else if(x<y)
            System.out.println("Y "+x);
        else System.out.println("M "+y);
    }
}
