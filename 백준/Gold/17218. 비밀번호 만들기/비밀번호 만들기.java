import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=Math.max(dp[i-1][j-1]+1,dp[i][j-1]);
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int res = dp[s1.length()][s2.length()];
        Stack<Character> stack = new Stack<>();

        int a = s2.length();
        while(res>0){
            boolean b = true;
            for(int i=1;i<=s1.length();i++){
                for(int j=1;j<=a;j++){
                    if(dp[i][j]==res){
                        stack.add(s2.charAt(j-1));
                        res--;
                        a=j-1;
                        b=false;
                        break;
                    }
                }
                if(!b)
                    break;
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
