import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int xx1 = Math.abs(x-x1)+Math.abs(y-y1);
            int xx2 = Math.abs(x-x2)+Math.abs(y-y2);
            int xx3 = Math.abs(x-x3)+Math.abs(y-y3);
            if(xx1%a!=0)
                xx1=xx1-xx1%a+a;
            if(xx2%b!=0)
                xx2=xx2-xx2%b+b;
            if(xx3%c!=0)
                xx3=xx3-xx3%c+c;
            int res = Math.min(Math.min(xx1,xx2),xx3);
            System.out.println(res);
        }

    }
}
