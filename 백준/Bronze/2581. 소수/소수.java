import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[b+1];
        arr[1]=true;
        for(int i=2;i<=b/2;i++){
            int x = i*2;
            while(x<=b){
                arr[x]=true;
                x+=i;
            }
        }
        int res=0;
        for(int i=a;i<=b;i++){
            if(!arr[i])
                res+=i;
        }
        if(res==0){
            System.out.println(-1);
            return;
        }
        System.out.println(res);
        for(int i=a;i<=b;i++){
            if(!arr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}