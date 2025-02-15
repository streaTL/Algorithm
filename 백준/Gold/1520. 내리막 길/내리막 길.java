import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] xx = new int[]{1,-1,0,0};
    static int[] yy = new int[]{0,0,1,-1};
    static int[][] arr;
    static int[][] arr2;
    static int a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr = new int[a+2][b+2];
        arr2 = new int[a+2][b+2];
        for(int[] i : arr){
            Arrays.fill(i,100000);
        }
        for(int[] i : arr2){
            Arrays.fill(i,-1);
        }
        for(int i=1;i<=a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=b;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(dfs(1,1));
    }

    static int dfs(int x, int y){
        if(x==a&&y==b){
            return 1;
        }
        if (arr2[x][y] != -1) return arr2[x][y];
        arr2[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + xx[i];
            int ny = y + yy[i];
            if(arr[x][y] > arr[nx][ny]){
                arr2[x][y]+=dfs(nx,ny);
            }
        }
        return arr2[x][y];
    }
}
