import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] nn = new int[n+1];
        int[] mm = new int[m+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            nn[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=m;i++){
            mm[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nn);
        Arrays.sort(mm);
        int[][] dp;
        if(n<m){
            dp = new int[n+1][m+1];
            for(int i=1;i<=n;i++){
                for(int j=i;j<=m-n+i;j++){
                    if(j==i){
                        dp[i][j]=Math.abs(nn[j]-mm[i])+dp[i-1][j-1];
                        continue;
                    }
                    dp[i][j]=Math.min(Math.abs(mm[j]-nn[i])+dp[i-1][j-1],dp[i][j-1]);
                }
            }
            System.out.print(dp[n][m]);
        }
        else{
            dp = new int[m+1][n+1];
            for(int i=1;i<=m;i++){
                for(int j=i;j<=n-m+i;j++){
                    if(j==i){
                        dp[i][j]=Math.abs(nn[j]-mm[i])+dp[i-1][j-1];
                        continue;
                    }
                    dp[i][j]=Math.min(Math.abs(nn[j]-mm[i])+dp[i-1][j-1],dp[i][j-1]);
                }
            }
            System.out.println(dp[m][n]);
        }
//        for(int[] i : dp){
//            for(int j : i)
//                System.out.print(j+" ");
//            System.out.println();
//        }
    }
}