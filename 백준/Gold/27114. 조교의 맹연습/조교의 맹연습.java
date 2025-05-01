import javax.swing.*;
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
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[][] dp = new int[d+1][4];
        for(int i=a;i<=d;i+=a){
            dp[i][i/a%4]=i/a;
        }
        for(int i=1;i<=d;i++){
            if(i%b==0&&(dp[i][(4-(i/b%4))%4]>i/b||dp[i][(4-(i/b%4))%4]==0)){
                dp[i][(4-(i/b%4))%4]=i/b;
            }
            if(dp[i][0]!=0&&i+b<=d&&(dp[i+b][3]>dp[i][0]+1||dp[i+b][3]==0)){
                dp[i+b][3]=dp[i][0]+1;
            }
            if(dp[i][1]!=0&&i+b<=d&&(dp[i+b][0]>dp[i][1]+1||dp[i+b][0]==0)){
                dp[i+b][0]=dp[i][1]+1;
            }
            if(dp[i][2]!=0&&i+b<=d&&(dp[i+b][1]>dp[i][2]+1||dp[i+b][1]==0)){
                dp[i+b][1]=dp[i][2]+1;
            }
            if(dp[i][3]!=0&&i+b<=d&&(dp[i+b][2]>dp[i][3]+1||dp[i+b][2]==0)){
                dp[i+b][2]=dp[i][3]+1;
            }
        }
        for(int i=1;i<=d;i++){
            if(i/c%2==0){
                if(i%c==0&&(dp[i][0]>i/c||dp[i][0]==0)){
                    dp[i][0]=i/c;
                }
            }
            else {
                if(i%c==0&&(dp[i][2]>i/c||dp[i][2]==0)){
                    dp[i][2]=i/c;
                }
            }
            if(dp[i][0]!=0&&i+c<=d&&(dp[i+c][2]>dp[i][0]+1||dp[i+c][2]==0)){
                dp[i+c][2]=dp[i][0]+1;
            }
            if(dp[i][1]!=0&&i+c<=d&&(dp[i+c][3]>dp[i][1]+1||dp[i+c][3]==0)){
                dp[i+c][3]=dp[i][1]+1;
            }
            if(dp[i][2]!=0&&i+c<=d&&(dp[i+c][0]>dp[i][2]+1||dp[i+c][0]==0)){
                dp[i+c][0]=dp[i][2]+1;
            }
            if(dp[i][3]!=0&&i+c<=d&&(dp[i+c][1]>dp[i][3]+1||dp[i+c][1]==0)){
                dp[i+c][1]=dp[i][3]+1;
            }
        }
        if(dp[d][0]==0)
            System.out.println(-1);
        else System.out.println(dp[d][0]);
    }
}
