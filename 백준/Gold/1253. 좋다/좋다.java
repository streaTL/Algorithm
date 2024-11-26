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
        st =new StringTokenizer(br.readLine());
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<a;i++){
            int x=0;
            int y=a-1;
            if(i==a-1)
                y--;
            if(i==0)
                x++;
            while(x!=y){
                if(arr[x]+arr[y]==arr[i]){
                    res++;
                    break;
                }
                else if(arr[x]+arr[y]>arr[i]){
                    y--;
                    if(y==i)
                        y--;
                }
                else if(arr[x]+arr[y]<arr[i]){
                    x++;
                    if(x==i)
                        x++;
                }
            }
        }
        System.out.println(res);
    }
}
