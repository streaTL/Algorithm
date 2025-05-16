import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[100001];
        int[] num = new int[a];
        for(int i=0;i<a;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int c=0;
        int res=0;
        int left=0;
        for(int i=0;i<a;i++){
            int x = num[i];
            arr[x]++;
            c++;
            while(arr[x]>b){
                arr[num[left]]--;
                left++;
                c--;
            }
            res = Math.max(res,c);
        }
        System.out.print(res);
    }
}