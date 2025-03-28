import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[a][3];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }

        int[][]arr2 = new int[a][3];
        int[][]arr3 = new int[a][3];
        arr2[0][0]=arr[0][0];
        arr2[0][1]=arr[0][1];
        arr2[0][2]=arr[0][2];
        arr3[0][0]=arr[0][0];
        arr3[0][1]=arr[0][1];
        arr3[0][2]=arr[0][2];
        for(int i=1;i<a;i++){
            arr2[i][0]=Math.max(arr2[i-1][0],arr2[i-1][1])+arr[i][0];
            arr2[i][2]=Math.max(arr2[i-1][1],arr2[i-1][2])+arr[i][2];
            arr2[i][1]=Math.max(Math.max(arr2[i-1][1],arr2[i-1][2]),arr2[i-1][0])+arr[i][1];
        }
        for(int i=1;i<a;i++){
            arr3[i][0]=Math.min(arr3[i-1][0],arr3[i-1][1])+arr[i][0];
            arr3[i][2]=Math.min(arr3[i-1][1],arr3[i-1][2])+arr[i][2];
            arr3[i][1]=Math.min(Math.min(arr3[i-1][1],arr3[i-1][2]),arr3[i-1][0])+arr[i][1];
        }
        System.out.print(Math.max(Math.max(arr2[a-1][1],arr2[a-1][2]),arr2[a-1][0])+" "+Math.min(Math.min(arr3[a-1][1],arr3[a-1][2]),arr3[a-1][0]));
    }
}
