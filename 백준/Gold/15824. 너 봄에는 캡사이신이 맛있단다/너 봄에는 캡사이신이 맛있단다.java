import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        st=new StringTokenizer(br.readLine());
        long sum=0;
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }

        Arrays.sort(arr);
        long t=arr[a-1]-arr[0];
        long z=t;
        long f=2;
        if(a==1){
            System.out.println(0);
            return;
        }
        else if(a==2){
            System.out.println(t%1000000007);
            return;
        }
        else{
            for(int i=1;i<a;i++){
                z+=arr[a-i-1];
                z-=arr[i];
                z=z%1000000007;
                long c=z;
                c=c*f;
                c=c%1000000007;
                f*=2;
                f=f%1000000007;
                t+=c;
            }
            t=t%1000000007;
            if(t<0)
                t+=1000000007;
            System.out.println(t);
        }
    }
}
