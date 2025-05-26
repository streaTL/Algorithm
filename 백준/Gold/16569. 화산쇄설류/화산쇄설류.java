import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        boolean[][] brr = new boolean[n][m];
        boolean[][] brr2 = new boolean[n][m];
        boolean[][] brr3 = new boolean[n][m];
        int[] xx = {-1,1,0,0};
        int[] yy = {0,0,1,-1};

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;
        brr3[a][b]=true;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        int[][] bol = new int[v][3];
        for(int i=0;i<v;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            int z = Integer.parseInt(st.nextToken());
            bol[i][0]=x;
            bol[i][1]=y;
            bol[i][2]=z;
            brr[x][y]=true;
        }
        Arrays.sort(bol,(x,y)->x[2]-y[2]);
        Queue<int[]> q = new ArrayDeque<>();
        Queue<int[]> q2 = new ArrayDeque<>();
        q.add(new int[]{a,b});
        int start = -1;
        int count = 0;
        int res=arr[a][b];
        int res2=0;
        int cu = 0;
        while(!q.isEmpty()){
            cu++;
            start++;
            for(int i=count;i<v;i++){
                if(bol[i][2]==start){
                    q2.add(new int[]{bol[i][0],bol[i][1]});
                    brr2[bol[i][0]][bol[i][1]]=true;
                }
                else{
                    count=i;
                    break;
                }
            }
            int size1 = q2.size();
            for(int i=0;i<size1;i++){
                int[]xr = q2.poll();
                for(int j=0;j<4;j++){
                    int x = xr[0]+xx[j];
                    int y = xr[1]+yy[j];
                    if(x>=0&&x<n&&y>=0&&y<m&&!brr2[x][y]){
                        brr[x][y]=true;
                        brr2[x][y]=true;
                        q2.add(new int[]{x,y});
                    }
                }
            }

            int size2 = q.size();
            for(int i=0;i<size2;i++){
                int[]xr = q.poll();
                for(int j=0;j<4;j++){
                    int x = xr[0]+xx[j];
                    int y = xr[1]+yy[j];
                    if(x>=0&&x<n&&y>=0&&y<m&&!brr[x][y]&&!brr3[x][y]){
                        brr3[x][y]=true;
                        q.add(new int[]{x,y});
                        if(res<arr[x][y]){
                            res=arr[x][y];
                            res2=cu;
                        }
                    }
                }
            }
        }

        System.out.println(res+" "+res2);

    }
}
