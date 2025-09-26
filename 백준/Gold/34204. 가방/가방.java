import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int y=0;
        int e = K-1;
        long sum=0;
        if(e<N-1){
            for(int i=0;i<=e;i++){
                sum+=arr[i];
            }
        }
        else{
            for(int i=0;i<N;i++){
                sum+=arr[i];
            }
            for(int i=0;i<C;i++){
                sb.append(sum).append("\n");
            }
            System.out.println(sb);
            return;
        }
        int x = C;
        while(true){
            if(arr[y]<=x){
                if(e==N){
                    for(int i=0;i<=x;i++){
                        sb.append(sum+"\n");
                    }
                    break;
                }
                if(y==0){
                    for(int i=1;i<arr[y];i++){
                        sb.append(sum+"\n");
                    }
                }
                else {
                    for(int i=0;i<arr[y];i++){
                        sb.append(sum+"\n");
                    }
                }
                x-=arr[y];
                e++;
                if(e<N){
                    sum-=arr[y];
                    y++;
                    sum+=arr[e];
                }
            }
            else{
                if(y==0){
                    for(int i=0;i<x;i++){
                        sb.append(sum+"\n");
                    }
                }
                else{
                    for(int i=0;i<=x;i++){
                        sb.append(sum+"\n");
                    }
                }
                break;
            }
        }
        System.out.println(sb);
    }
}
