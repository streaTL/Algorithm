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
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long t=arr[a-1]-arr[0];
        if(a==1){
            System.out.println(0);
            return;
        }
        else if(a==2){
            System.out.println(t%1000000007);
            return;
        }
        else{
            for(int i=2;i<a;i++){
                int x=0;
                int y=x+i;
                long z=0;
                while(y<a){
                    z+=arr[y];
                    z-=arr[x];
                    x++;
                    y++;
                }
                if(z>1000000007)
                    z=z%1000000007;
                for(int j=0;j<i-1;j++){
                    z*=2;
                    if(z>1000000007)
                        z=z%1000000007;
                }
                t+=z;
            }
            t=t%1000000007;
            System.out.println(t);
        }
    }
}
