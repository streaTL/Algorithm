import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[][] brr = new boolean[m][n];
        int[][][] arr = new int[m][n][4];
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                brr[i][j]=Integer.parseInt(st.nextToken())==0;
            }
        }
        int[] xx = {-1,0,1,0};
        int[] yy = {0,1,0,-1};
        Queue<int[]> q = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        int e1 = Integer.parseInt(st.nextToken());
        int e2 = Integer.parseInt(st.nextToken());
        int e3 = Integer.parseInt(st.nextToken());
        if(e3==2){
            e3=3;
        }
        else if(e3==3){
            e3=2;
        }
        q.add(new int[]{e1-1,e2-1,e3%4});
        while(!q.isEmpty()){
            int[] x = q.poll();
            int a1 = x[0];
            int a2 = x[1];
            int a3 = x[2];
            if(arr[a1][a2][(a3+1)%4]==0||arr[a1][a2][(a3+1)%4]>arr[a1][a2][a3]+1){
                arr[a1][a2][(a3+1)%4]=arr[a1][a2][a3]+1;
                q.add(new int[]{a1,a2,(a3+1)%4});
            }
            if(a3!=0){
                if(arr[a1][a2][(a3-1)%4]==0||arr[a1][a2][(a3-1)%4]>arr[a1][a2][a3]+1){
                    arr[a1][a2][(a3-1)%4]=arr[a1][a2][a3]+1;
                    q.add(new int[]{a1,a2,(a3-1)%4});
                }
            }
            else{
                if(arr[a1][a2][3]==0||arr[a1][a2][3]>arr[a1][a2][a3]+1){
                    arr[a1][a2][3]=arr[a1][a2][a3]+1;
                    q.add(new int[]{a1,a2,3});
                }
            }
            for(int i=1;i<=3;i++){
                int x1 = a1+xx[a3]*i;
                int x2 = a2+yy[a3]*i;
                if(x1>=0&&x1<m&&x2>=0&&x2<n&&!brr[x1][x2]){
                    break;
                }
                if(x1>=0&&x1<m&&x2>=0&&x2<n&&(arr[x1][x2][a3]==0||arr[x1][x2][a3]>arr[a1][a2][a3]+1)&&brr[x1][x2]){
                    arr[x1][x2][a3]=arr[a1][a2][a3]+1;
                    q.add(new int[]{x1,x2,a3});
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int a3 = Integer.parseInt(st.nextToken());
        if(a3==2){
            a3=3;
        }
        else if(a3==3){
            a3=2;
        }
        if(a1==e1&&a2==e2&&a3==e3)
            System.out.println(0);
        else
            System.out.println(arr[a1-1][a2-1][a3%4]);
    }
}
