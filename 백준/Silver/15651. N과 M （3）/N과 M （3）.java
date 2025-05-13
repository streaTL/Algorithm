import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        arr = new int[b];
        dfs(a,b,0);
        System.out.print(sb);
    }
    private static void dfs(int a, int b, int c){
        if(c==b){
            for(int i : arr)
                sb.append(i+" ");
            sb.append("\n");
            return;
        }
        for(int i=1;i<=a;i++){
            arr[c]=i;
            dfs(a,b,c+1);
        }
    }
}