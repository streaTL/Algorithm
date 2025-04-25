import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][b];
        int[][][] dp = new int[a][b][2];
        int[][] res = new int[a][b];
        int[] xx = new int[]{-1,-1,-1,0,0,0,1,1,1};
        int[] yy = new int[]{-1,0,1,-1,0,1,-1,0,1};

        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                int c=arr[i][j];
                for(int k=0;k<9;k++){
                    int x = i+xx[k];
                    int y = j+yy[k];
                    if(x>=0&&x<a&&y>=0&&y<b&&arr[x][y]<=c){
                        dp[i][j][0]=x;
                        dp[i][j][1]=y;
                        c=arr[x][y];
                    }
                }
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                int x=i;
                int y=j;
                while(true){
                    if(dp[x][y][0]==x&&dp[x][y][1]==y){
                        res[x][y]++;
                        break;
                    }
                    else{
                        int q = dp[x][y][0];
                        int w = dp[x][y][1];
                        dp[x][y][0]=dp[q][w][0];
                        dp[x][y][1]=dp[q][w][1];
                        x=q;
                        y=w;
                    }
                }
            }
        }
        for(int[] i : res){
            for(int j : i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
