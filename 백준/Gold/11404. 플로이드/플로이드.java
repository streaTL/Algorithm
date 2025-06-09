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
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];
        int[][] arr2 = new int[n+1][n+1];
        for(int[] i : arr2){
            Arrays.fill(i,2000000000);
        }
        for(int i=0;i<=n;i++){
            arr2[i][i]=0;
        }
        StringTokenizer st;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(arr[a][b]!=0)
                arr[a][b]=Math.min(arr[a][b],c);
            else
                arr[a][b]=c;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            q.add(i);
            while(!q.isEmpty()){
                int x = q.poll();
                for(int j=1;j<=n;j++){
                    if(arr[x][j]!=0&&arr[x][j]+arr2[i][x]<arr2[i][j]){
                        arr2[i][j]=arr[x][j]+arr2[i][x];
                        q.add(j);
                    }
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(arr2[i][j]==2000000000)
                    System.out.print("0 ");
                else
                    System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
