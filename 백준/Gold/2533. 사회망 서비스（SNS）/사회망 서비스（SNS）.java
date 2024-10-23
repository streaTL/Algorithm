import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int[][] dp;
    static ArrayList<ArrayList<Integer>> ar;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        ar = new ArrayList<>();
        for(int i=0;i<=a;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<a-1;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            ar.get(y).add(x);
        }
        visited = new boolean[a+1];
        dp = new int[a+1][2];
        dfs(1);
        System.out.println(Math.min(dp[1][0], dp[1][1]));
    }

    static void dfs(int number) {
        visited[number] = true;
        dp[number][0] = 0;
        dp[number][1] = 1;
        for (int child : ar.get(number)) {
            if (!visited[child]) {
                dfs(child);
                dp[number][0] += dp[child][1];
                dp[number][1] += Math.min(dp[child][0], dp[child][1]);
            }
        }
    }
}
