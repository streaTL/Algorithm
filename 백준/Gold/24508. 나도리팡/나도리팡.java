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
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());
        long sum=0;
        for(int i=0;i<a;i++){
            int x = Integer.parseInt(st.nextToken());
            arr[i]=x;
            sum+=x;
        }
//        System.out.println(sum);
        if(sum%b!=0){
            System.out.println("NO");
            return;
        }
        Arrays.sort(arr);
        int x=a-1;
//        System.out.println(sum);
        long d = sum/b;
//        System.out.println(d);
        for(int i=0;i<d;i++){
//            System.out.println(x);
            sum-=arr[x];
            x--;
        }
//        System.out.println(sum);
        if(sum>c)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
