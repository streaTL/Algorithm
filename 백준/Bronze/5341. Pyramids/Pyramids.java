import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                break;
            int res=0;
            for(int i=1;i<=a;i++){
                res+=i;
            }
            System.out.println(res);
        }
    }
}
