import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        boolean[][] brr = new boolean[a][a];
        for(int i=0;i<a;i++){
            String s = br.readLine();
            for(int j=0;j<a;j++){
                if(s.charAt(j)=='Y')
                    brr[i][j]=true;
            }
        }
        int[][] arr = new int[a][a];
        for(int[] i : arr)
            Arrays.fill(i,-1);
        for(int i=0;i<a;i++)
            arr[i][i]=0;
        for(int i=0;i<a;i++){
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            int x=1;
            while(!q.isEmpty()){
                int y = q.size();
                for(int j=0;j<y;j++){
                    int z = q.poll();
                    for(int k=0;k<a;k++){
                        if(brr[z][k]&&arr[i][k]==-1){
                            arr[i][k]=x;
                            q.add(k);
                        }
                    }
                }
                x++;
            }
        }
        int res = 0;
        for(int[] i : arr){
            for(int j : i){
                if(j==-1){
                    System.out.println(-1);
                    return;
                }
                res = Math.max(res,j);
            }
        }
        System.out.println(res*b);
    }
}
