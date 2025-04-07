import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long[][] dp = new long[N][N];
        int[][] maxA = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            maxA[i][i] = a[i];
            for (int j = i + 1; j < N; j++) {
                maxA[i][j] = Math.max(maxA[i][j - 1], a[j]);
            }
        }

        for (int len = 2; len <= N; len++) {
            for (int i = 0; i <= N - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Long.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[i][k] + dp[k + 1][j] + maxA[i][k] + maxA[k + 1][j]);
                }
            }
        }

        System.out.println(dp[0][N - 1]);
    }
}
