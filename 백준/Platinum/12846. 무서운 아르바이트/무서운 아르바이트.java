import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println(find(n, arr));
    }
    private static int find(int n, int[] arr){
        int res=0;
        Stack<int[]> stt = new Stack<>();
        for(int i=0;i<n;i++){
            int start = i;
            while(!stt.isEmpty()&&stt.peek()[1]>arr[i]){
                int[] pop = stt.pop();
                int x = pop[0], y = pop[1];
                res = Math.max(res,(i-x)*y);
                start = x;
            }
            stt.push(new int[]{start,arr[i]});
        }
        while(!stt.isEmpty()){
            int[] pop = stt.pop();
            int x = pop[0], y = pop[1];
            res = Math.max(res,(n-x)*y);
        }
        return res;
    }
}