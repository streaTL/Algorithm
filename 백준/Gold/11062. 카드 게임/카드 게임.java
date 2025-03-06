import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[][][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<tc;t++){
            int a = Integer.parseInt(br.readLine());
            arr = new int[a];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<a;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            dp = new int[a][a][2];
            for(int[][] i : dp){
                for(int[] j : i){
                    Arrays.fill(j,-1);
                }
            }
            sb.append(dfs(0,a-1,1)+"\n");
        }
        System.out.println(sb);
    }
    static int dfs(int le, int ri, int tu){
        if (le > ri) return 0;
        if (dp[le][ri][tu] != -1) return dp[le][ri][tu];
        if (tu == 1) { // 근우 = (최대 점수 선택)
            dp[le][ri][tu] = Math.max(
                    arr[le] + dfs(le + 1, ri, 0),
                    arr[ri] + dfs(le, ri - 1, 0)
            );
        } else { // 명우 = (근우의 점수를 최소화)
            dp[le][ri][tu] = Math.min(
                    dfs(le + 1, ri, 1),
                    dfs(le, ri - 1, 1)
            );
        }
        return dp[le][ri][tu];
    }
}
