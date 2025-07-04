import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][b];
        int[][][] num = new int[a][b][2];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                int x =Integer.parseInt(st.nextToken());
                arr[i][j]=x;
//                num[i][j][0]=x;
//                num[i][j][1]=x;
            }
        }

        int[] xx = {0,0,1,-1};
        int[] yy = {1,-1,0,0};
        for(int[][]i : num){
            for(int[]j : i){
                Arrays.fill(j,-1);
            }
        }
        num[0][0][0] = arr[0][0];
        num[0][0][1] = arr[0][0];
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int[] g = q.poll();
            for(int i=0;i<4;i++){
                int x = g[0]+xx[i];
                int y = g[1]+yy[i];
                int z = Math.max(arr[g[0]][g[1]],num[g[0]][g[1]][g[2]]);
                if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][g[2]]>z||num[x][y][g[2]]==-1)){
//                if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][g[2]]>arr[g[0]][g[1]]||num[x][y][g[2]]==-1)){
//                if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][g[2]]>num[g[0]][g[1]][g[2]]||num[x][y][g[2]]==-1)){
//                    num[x][y][g[2]]=num[g[0]][g[1]][g[2]];
//                    num[x][y][g[2]]=arr[g[0]][g[1]];
                    num[x][y][g[2]]=z;
                    q.add(new int[]{x,y,g[2]});
                }
            }
            if(g[2]==0){
                for(int i=0;i<4;i++){
                    int x = g[0]+xx[i]*2;
                    int y = g[1]+yy[i]*2;
                    int z = Math.max(arr[g[0]][g[1]],num[g[0]][g[1]][g[2]]);
                    if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][1]>z||num[x][y][1]==-1)){
//                    if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][1]>arr[g[0]][g[1]]||num[x][y][1]==-1)){
//                    if(x>=0&&x<a&&y>=0&&y<b&&(num[x][y][1]>num[g[0]][g[1]][g[2]]||num[x][y][1]==-1)){
//                        num[x][y][1]=num[g[0]][g[1]][g[2]];
//                        num[x][y][1]=num[g[0]][g[1]][g[2]];
//                        num[x][y][1]=arr[g[0]][g[1]];
                        num[x][y][1]=z;
                        q.add(new int[]{x,y,1});
                    }
                }
            }
        }
//        for(int i=0;i<2;i++){
//            for(int j=0;j<a;j++){
//                for(int k=0;k<b;k++){
//                    System.out.print(num[j][k][i]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        System.out.println(Math.max(arr[a-1][b-1],Math.min(num[a-1][b-1][1],num[a-1][b-1][0])));
    }
}
