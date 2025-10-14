import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int x = 0;
        int y = n-1;
        int sum = Integer.MAX_VALUE;
        int cur = sum;
        while(x!=y){
            cur = arr[x]+arr[y];
            if(Math.abs(arr[x]+arr[y])<=Math.abs(sum)) {
                sum = arr[x] + arr[y];
            }
            if(cur==0){
                System.out.println(0);
                return;
            }
            else if(cur>0){
                y--;
            }
            else x++;

        }
        System.out.println(sum);


    }
}
