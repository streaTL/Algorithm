import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] di;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st;
        di = new int[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            di[i]=i;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->x[2]-y[2]);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(new int[]{i,j,arr[i][j]});
            }
        }
        int res=0;
        long sum=0;
        while(res<n-1){
            int[] t = pq.poll();
            int x = t[0];
            int y = t[1];
            int z = t[2];
            if(x==y)
                continue;
            if(find(x)==find(y))
                continue;
            di[find(x)]=di[find(y)];
            res++;
            sum+=z;
        }
        System.out.println(sum);
    }
    public static int find(int x){
        if(di[x]==x)
            return x;
        return di[x]=find(di[x]);
    }
}
