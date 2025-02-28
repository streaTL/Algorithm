import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
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
        Arrays.fill(dp,1000000000);
        dp[0]=0;
        for(int i : arr){
            for(int j=i;j<=b;j++){
                    dp[j]=Math.min(dp[j],dp[j-i]+1);
            }
        }
        if(dp[b]==1000000000)
            System.out.println(-1);
        else
            System.out.println(dp[b]);
    }
}
