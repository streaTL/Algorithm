import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b+1];
        for(int i=0;i<=b;i++){
            arr[i]=i;
        }
        int[][] arr2 = new int[a][3];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            arr2[i][0]=x;
            arr2[i][1]=y;
            arr2[i][2]=z;
        }
        Arrays.sort(arr2,(x,y)->x[0]-y[0]);
        for(int i=0;i<a;i++){
            int x = arr2[i][0];
            int y = arr2[i][1];
            int z = arr2[i][2];
            if(y>b)
                continue;
            arr[y]=Math.min(arr[x]+z,arr[y]);
            for(int j=y+1;j<=b;j++){
                arr[j]=Math.min(arr[j],arr[y]+j-y);
            }
        }
        System.out.print(arr[b]);
    }
}