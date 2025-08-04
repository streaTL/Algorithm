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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        boolean[] brr = new boolean[n];
        for(int i=0;i<n;i++){
            brr[i]=Integer.parseInt(br.readLine())==1;
        }
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int[][] vi = new int[n][2];
        for(int[] i : vi){
            Arrays.fill(i,99999999);
        }
        vi[0][0]=0;
        vi[0][1]=0;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,0,0});
        while(!q.isEmpty()){
            int[]ar = q.poll();
            for(int i=0;i<n;i++){
                if(arr[ar[2]][i]!=0){
                    if(brr[ar[2]]!=brr[i]){
                        if(vi[i][0]>ar[0]+1){
                            vi[i][0]=ar[0]+1;
                            vi[i][1]=ar[1]+arr[ar[2]][i];
                            q.add(new int[]{vi[i][0],vi[i][1],i});
                        }
                        else if(vi[i][0]==ar[0]+1&&vi[i][1]>=ar[1]+arr[ar[2]][i]){
                            vi[i][0]=ar[0]+1;
                            vi[i][1]=ar[1]+arr[ar[2]][i];
                            q.add(new int[]{vi[i][0],vi[i][1],i});
                        }
                    }
                    else{
                        if(vi[i][0]>ar[0]){
                            vi[i][0]=ar[0];
                            vi[i][1]=ar[1]+arr[ar[2]][i];
                            q.add(new int[]{vi[i][0],vi[i][1],i});
                        }
                        else if(vi[i][0]==ar[0]&&vi[i][1]>=ar[1]+arr[ar[2]][i]){
                            vi[i][0]=ar[0];
                            vi[i][1]=ar[1]+arr[ar[2]][i];
                            q.add(new int[]{vi[i][0],vi[i][1],i});
                        }
                    }
                }
            }
        }
        System.out.println(vi[m][0]+" "+vi[m][1]);
    }
}
