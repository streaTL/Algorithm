import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=0;tc<t;tc++){
            String s = br.readLine();
            long[] dp = new long[s.length()+1];
            dp[0]=1;
            int[] count = new int['z'+1];
            Arrays.fill(count,-1);
            for(int i=1;i<=s.length();i++){
                dp[i]=dp[i-1]*2;
                if(count[s.charAt(i-1)]!=-1){
                    dp[i]-=dp[count[s.charAt(i-1)]];
                }
                count[s.charAt(i-1)]=i-1;
            }
            System.out.println(dp[s.length()]);
        }
    }
}
