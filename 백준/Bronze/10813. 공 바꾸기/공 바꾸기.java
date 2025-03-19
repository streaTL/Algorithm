import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a+1];
        for(int i=1;i<=a;i++){
            arr[i]=i;
        }
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = arr[x];
            arr[x]=arr[y];
            arr[y]=z;
        }
        for(int i=1;i<=a;i++)
            System.out.print(arr[i]+" ");
    }
}