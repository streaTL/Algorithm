import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long x=9;
        int y=1;
        long sum=0;
        while(true){
            if(a-x<=0){
                sum+=a*y;
                break;
            }
            a-=x;
            sum+=x*y;
            x*=10;
            y++;
            if(sum>b)
                break;
        }
        if(sum<b){
            System.out.println(-1);
            return;
        }
        x=9;
        y=1;
        while(b>x*y){
            b-=x*y;
            x*=10;
            y++;
        }
        long z = (long)Math.pow(10,y-1);
        z+=(b-1)/y;
        int zz = (b-1)%y;
        System.out.println(Long.toString(z).charAt(zz));

    }
}
