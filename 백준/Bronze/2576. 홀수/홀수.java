import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 10000;
        int sum = 0;
        for(int i=0;i<7;i++){
            int a = Integer.parseInt(br.readLine());
            if(a%2==1){
                sum+=a;
                res = Math.min(res,a);
            }
        }
        if(sum==0){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(res);
    }
}
