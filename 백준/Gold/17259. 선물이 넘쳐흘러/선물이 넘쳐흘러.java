import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[b][b];
        int[][] arr2 = new int[n][4];
        int[] xx = {1,0,-1};
        int[] yy = {0,1,0};
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            arr[x][y]=z;
            arr2[i][0]=x;
            arr2[i][1]=y;
            arr2[i][2]=z;
        }
        int res=m;
        int sum=0;
        for(int i=0;i<b*3+m;i++){
            if(arr[b-1][0]==-1){
                res--;
                arr[b-1][0]=0;
            }
            for(int j=0;j<b-1;j++){
                if(arr[b-1][j+1]==-1){
                    arr[b-1][j]=-1;
                    arr[b-1][j+1]=0;
                }
            }
            for(int j=b-1;j>0;j--){
                if(arr[j-1][b-1]==-1){
                    arr[j][b-1]=-1;
                    arr[j-1][b-1]=0;
                }
            }
            for(int j=b-1;j>0;j--){
                if(arr[0][j-1]==-1){
                    arr[0][j]=-1;
                    arr[0][j-1]=0;
                }
            }
            if(i<m)
                arr[0][0]=-1;
            for(int j=0;j<n;j++){
                if(arr2[j][3]!=0)
                    arr2[j][3]--;
                else{
                    for(int k=0;k<3;k++){
                        int x = arr2[j][0]+xx[k];
                        int y = arr2[j][1]+yy[k];
                        if(arr[x][y]==-1){
                            sum++;
                            arr[x][y]=0;
                            arr2[j][3]=arr2[j][2]-1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(res);

    }
}