import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        int[] arr = new int[51];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            arr[b]=arr[b]+1;
        }
        int x=0;
        for(int i=50;i>0;i--){
            if(arr[i]==i){
                System.out.println(i);
                x=1;
                break;
            }
        }
        if(x==0){
            if(arr[0]>0)
                System.out.println(-1);
            else System.out.println(0);
        }

    }
}
