import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int tc=0; tc<T;tc++){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            int u=1, sd=0, ed=1, sp=0, ep=1;
            boolean b = true;
            for(int i=0;i<n;i++){
                if(u==sd){
                    u=ed;
                    sd=0;
                    ed=0;
                }
                else if(u==sp){
                    u=ep;
                    sp=0;
                    ep=0;
                }
                if(arr[i]==u)
                    u++;
                else if(arr[i]==ed){
                    ed++;
                }
                else if(arr[i]==ep){
                    ep++;
                }
                else if(sd==0){
                    sd=arr[i];
                    ed=arr[i]+1;
                }
                else if(sp==0){
                    sp=arr[i];
                    ep=arr[i]+1;
                }
                else{
                    b=false;
                    break;
                }
            }
            if(b)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
        System.out.print(sb);
    }
}