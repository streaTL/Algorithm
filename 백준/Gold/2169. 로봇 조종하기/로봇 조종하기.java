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
        int[][] arr = new int[a][b];
        int[][] dp = new int[a][b];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0]=arr[0][0];
        for(int i=1;i<b;i++){
            dp[0][i]=dp[0][i-1]+arr[0][i];
        }
        for(int i=1;i<a;i++){
            int[] xx = new int[b];
            int[] yy = new int[b];
            xx[0]=dp[i-1][0]+arr[i][0];
            yy[b-1]=dp[i-1][b-1]+arr[i][b-1];
            for(int j=1;j<b;j++){
                xx[j]=Math.max(dp[i-1][j],xx[j-1])+arr[i][j];
            }
            for(int j=b-2;j>=0;j--){
                yy[j]=Math.max(dp[i-1][j],yy[j+1])+arr[i][j];
            }
            for(int j=0;j<b;j++){
                dp[i][j]=Math.max(xx[j],yy[j]);
            }
        }
        System.out.println(dp[a-1][b-1]);
    }
}
