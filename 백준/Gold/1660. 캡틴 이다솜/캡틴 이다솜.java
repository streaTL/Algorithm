import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> ar = new ArrayList<>();
        int x=1;
        while(true){
            int p = x*(x+1)*(x+2)/6;
            if(p>a) {
                break;
            }
            ar.add(p);
            x++;
        }

        int[] dp = new int[a+1];
        Arrays.fill(dp,1000000);
        dp[0]=0;
        for(int i=1;i<=a;i++){
            for(int j : ar){
                if(j>i)
                    break;
                dp[i]=Math.min(dp[i],dp[i-j]+1);
            }
        }
        System.out.println(dp[a]);
    }
}
