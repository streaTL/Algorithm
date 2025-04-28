import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int[] arr = new int[x+1];
        arr[1]=1;
        int n=1;
        int y = (int)Math.sqrt(x);
        for(int i=2;i<=y;i++){
            if(arr[i]!=0)
                continue;
            else n++;
            int a = i;
            while(a<=x){
                if(arr[a]==0)
                    arr[a]=n;
                a+=i;
            }
        }
        for(int i=y;i<=x;i++){
            if(arr[i]==0){
                n++;
                arr[i]=n;
            }
        }
        System.out.println(n);
        for(int i=1;i<=x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
