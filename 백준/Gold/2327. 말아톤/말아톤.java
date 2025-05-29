import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] dp = new int[H + 1];
        Arrays.fill(dp, 0);
        dp[0] = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            for (int h = H; h >= x; h--) {
                if (dp[h-x] > 0) {
                    int cand = Math.min(dp[h-x], s);
                    dp[h] = Math.max(dp[h], cand);
                }
            }
        }
        System.out.println(dp[H]);
    }
}