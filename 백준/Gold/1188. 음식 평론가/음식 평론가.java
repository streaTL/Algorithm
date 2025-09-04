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
        if(a%b==0){
            System.out.println(0);
            return;
        }
        int x=a%b,y=b;
        int res=0;
        while(true){
            if(x%y==0){
                res=y;
                break;
            }
            int t=x;
            x=y;
            y=t%y;
        }
        System.out.println(b-res);

    }
}
