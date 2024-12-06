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

        int c=1;
        for(int i=0;i<b;i++)
            c*=10;
        if(b==0){
            System.out.println(a);
            return;
        }
        if(a%c>=c/2){
            a-=a%c;
            a+=c;
            System.out.println(a);
        }
        else{
            a-=a%c;
            System.out.println(a);
        }

    }
}
