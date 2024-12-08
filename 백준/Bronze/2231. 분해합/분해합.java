import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i=0;i<a;i++){
            int b=i;
            int c=i;
            while(c>0){
                b+=c%10;
                c/=10;
            }
            if(b==a){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
