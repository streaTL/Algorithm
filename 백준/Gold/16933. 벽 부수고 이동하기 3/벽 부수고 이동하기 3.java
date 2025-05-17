import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[] xx = new int[]{1,-1,0,0};
        int[] yy = new int[]{0,0,1,-1};
        for(int i=0;i<n;i++){
            // st = new StringTokenizer(br.readLine());
            String s = br.readLine();
            for(int j=0;j<m;j++){
                // map[i][j]=Integer.parseInt(st.nextToken());
                map[i][j]=s.charAt(j)-'0';
            }
        }
        int[][][] min = new int[n][m][k+1];
        min[0][0][0]=1;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] x = q.poll();
                for(int j=0;j<4;j++){
                    int nx = x[0]+xx[j];
                    int ny = x[1]+yy[j];
                    if(nx>=0&&nx<n&&ny>=0&&ny<m){
                        if(map[nx][ny]==0){
                            if(min[nx][ny][x[2]]==0||min[nx][ny][x[2]]>min[x[0]][x[1]][x[2]]+1){
                                min[nx][ny][x[2]]=min[x[0]][x[1]][x[2]]+1;
                                q.add(new int[]{nx,ny,x[2]});
                            }
                        }
                        else{
                            if(min[x[0]][x[1]][x[2]]%2==1){
                                if(x[2]<k&&(min[nx][ny][x[2]+1]>min[x[0]][x[1]][x[2]]+1||min[nx][ny][x[2]+1]==0)){
                                min[nx][ny][x[2]+1]=min[x[0]][x[1]][x[2]]+1;
                                q.add(new int[]{nx,ny,x[2]+1});
                                }
                            }
                            else{
                                if(x[2]<k&&(min[nx][ny][x[2]+1]>min[x[0]][x[1]][x[2]]+2||min[nx][ny][x[2]+1]==0)){
                                min[nx][ny][x[2]+1]=min[x[0]][x[1]][x[2]]+2;
                                q.add(new int[]{nx,ny,x[2]+1});
                                }
                            }
                        }
                    }
                }
            }
        }
        int res=10000000;
        for(int i : min[n-1][m-1]){
            if(i==0)
                continue;
            res=Math.min(res,i);
        }
        if(res==10000000)
            System.out.print(-1);
        else
            System.out.print(res);
    }
}