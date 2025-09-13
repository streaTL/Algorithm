import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[a];
        int x = 0;
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            x = Math.max(x,b);
            arr[i]=b;
        }
        for(int i=1;i<=x;i++){
            int sum=0;
            for(int j=0;j<a;j++){
                if(arr[j]%i==0)
                    sum++;
            }
            if(sum==a)
                System.out.println(i);
        }
    }
}
