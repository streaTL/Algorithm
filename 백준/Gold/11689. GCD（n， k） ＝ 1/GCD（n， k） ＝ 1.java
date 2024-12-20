import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long res = a;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                res-=res/i;
                while (a%i==0){
                    a/=i;
                }
            }
        }
        if(a>1) res=res-res/a;
        System.out.println(res);
    }
}
