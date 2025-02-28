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
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int[] dp = new int[b+1];
        dp[0]=1;
        for(int i : arr){
            for(int j=1;j<=b;j++){
                if(j-i>=0)
                    dp[j]+=dp[j-i];
            }
        }
        System.out.println(dp[b]);
    }
}
