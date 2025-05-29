import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String wo = br.readLine();
        List<String> ar = new ArrayList<>();
        for(int i=0;i<a;i++){
            ar.add(br.readLine());
        }

        int[] dp = new int[b+1];
        Arrays.fill(dp,Integer.MAX_VALUE/2);
        dp[0]=0;
        for(int i=1;i<=b;i++){
            dp[i] = dp[i-1] + 1;
            for(String s : ar){
                int si = s.length();
                if(si>i){
                    continue;
                }
                int p = si-1;
                int l = -1;
                for(int j=i-1;j>=0;j--){
                    if(wo.charAt(j)==s.charAt(p)) {
                        p--;
                        if (p < 0) {
                            l = j;
                            break;
                        }
                    }
                }
                if(l!=-1){
                    dp[i]=Math.min(dp[i],dp[l]+i-l-si);
                }
            }
        }
        System.out.println(dp[b]);
    }
}