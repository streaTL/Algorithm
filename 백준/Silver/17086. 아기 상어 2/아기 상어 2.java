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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a+2][b+2];
        for(int[] i : arr)
            Arrays.fill(i,-1);
        for(int i=1;i<=a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=b;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        boolean[][] brr = new boolean[a+2][b+2];
        for(int i=0;i<a+2;i++){
            brr[i][0]=true;
            brr[i][b+1]=true;
        }
        Arrays.fill(brr[0],true);
        Arrays.fill(brr[a+1],true);
        int[] xx = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] yy = new int[]{-1,0,1,-1,1,0,-1,1};
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(arr[i][j]==1){
                    brr[i][j]=true;
                    q1.add(i);
                    q2.add(j);
                }
            }
        }
        int n=0;
        while(!q1.isEmpty()){
            int x = q1.size();
            n++;
            for(int i=0;i<x;i++){
                int aa = q1.poll();
                int bb = q2.poll();
                for(int j=0;j<8;j++){
                    if(arr[aa+xx[j]][bb+yy[j]]<1&&!brr[aa+xx[j]][bb+yy[j]]){
                        brr[aa+xx[j]][bb+yy[j]]=true;
                        arr[aa+xx[j]][bb+yy[j]]=n;
                        q1.add(aa+xx[j]);
                        q2.add(bb+yy[j]);
                    }
                }
            }
        }
        System.out.println(n-1);
    }
}
