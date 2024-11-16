import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            arr[i]=Integer.parseInt(st.nextToken());

        }

        int x=arr[0];
        int y=arr[b-1];
        int res=0;
        int z=-1;
        int m=-1;
        for(int i=1;i<b;i++){
            if(arr[i]>z){
                z=arr[i];
                m=i;
            }
        }
        for(int i=1;i<m;i++){
            if(arr[i]>x)
                x=arr[i];
            else{
                res+=x-arr[i];
            }
        }
        for(int i=b-1;i>m;i--){
            if(arr[i]>y)
                y=arr[i];
            else{
                res+=y-arr[i];
            }
        }
        System.out.println(res);
    }
}
