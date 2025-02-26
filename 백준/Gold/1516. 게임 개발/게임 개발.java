import java.io.*;
import java.util.*;

public class Main {
    static int[] buildTime, dp;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        buildTime = new int[N + 1];
        dp = new int[N + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            buildTime[i] = Integer.parseInt(st.nextToken());
            while (true) {
                int pre = Integer.parseInt(st.nextToken());
                if (pre == -1) break;
                graph.get(i).add(pre);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(dfs(i)).append("\n");
        }
        System.out.print(sb);
    }
    static int dfs(int x) {
        if (dp[x] != -1) return dp[x];
        int maxTime = 0;
        for (int pre : graph.get(x)) {
            maxTime = Math.max(maxTime, dfs(pre));
        }
        dp[x] = maxTime + buildTime[x];
        return dp[x];
    }
}