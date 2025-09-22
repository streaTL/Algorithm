import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = a+b;
        int y = c+d;
        for(int i=0;i<3;i++){
            int t = Integer.parseInt(st.nextToken());
            int res = 0;
            if(t%x<=a&&t%x!=0)
                res++;
            if(t%y<=c&&t%y!=0)
                res++;
            System.out.println(res);
        }
    }
}
