import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        boolean[][] brr = new boolean[n][m];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->y[2]-x[2]);
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            pq.add(new int[]{0,i,arr[0][i]});
            if(n-1!=0)
                pq.add(new int[]{n-1,i,arr[n-1][i]});
            brr[0][i]=true;
            brr[n-1][i]=true;
        }
        for(int i=1;i<n-1;i++){
            pq.add(new int[]{i,0,arr[i][0]});
            if(m-1!=0)
                pq.add(new int[]{i,m-1,arr[i][m-1]});
            brr[i][0]=true;
            brr[i][m-1]=true;
        }
        StringBuilder sb = new StringBuilder();
        int[] xx = {1,0,-1,0};
        int[] yy = {0,1,0,-1};
        while(k!=0){
            int[] xrr = pq.poll();
            sb.append((xrr[0]+1)+" "+(xrr[1]+1)+"\n");
            for(int i=0;i<4;i++){
                int x = xrr[0]+xx[i];
                int y = xrr[1]+yy[i];
                if(x>=0&&x<n&&y>=0&&y<m&&!brr[x][y]){
                    brr[x][y]=true;
                    pq.add(new int[]{x,y,arr[x][y]});
                }
            }
            k--;
        }
        System.out.println(sb);

    }
}
