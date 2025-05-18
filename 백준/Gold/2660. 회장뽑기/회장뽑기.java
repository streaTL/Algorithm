import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[n+1][n+1];
        int[][] arr2 = new int[n+1][n+1];
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==-1)
                break;
            arr[a][b]=true;
            arr[b][a]=true;
        }
        for(int[] i : arr2){
            Arrays.fill(i,100);
        }
        for(int i=1;i<=n;i++){
            arr2[i][i]=0;
        }
        for(int i=1;i<=n;i++){
            Queue<Integer> q = new ArrayDeque<>();
            q.add(i);
            int count = 1;
            while(!q.isEmpty()){
                int size = q.size();
                for(int j=0;j<size;j++){
                    int x = q.poll();
                    for(int k=1;k<=n;k++){
                        if(arr[x][k]&&count<arr2[i][k]){
                            arr2[i][k]=count;
                            q.add(k);
                        }
                    }
                }
                count++;
            }
        }
        int res=0;
        int min = 100;
        for(int i=1;i<=n;i++){
            res=0;
            // min=100;
            for(int j=1;j<=n;j++){
                if(i==j)
                    continue;
                res = Math.max(res,arr2[i][j]);
            }
            min = Math.min(min,res);
        }
        int x=0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            int cc=0;
            for(int j=1;j<=n;j++){
                cc = Math.max(cc,arr2[i][j]);
            }
            if(cc==min){
                sb.append(i+" ");
                x++;
            }
        }
        System.out.println(min+" "+x);
        System.out.println(sb);
    }
}