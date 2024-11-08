import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int[] arr = new int[6];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int res=0;
        for(int i=0;i<6;i++){
            if(arr[i]%b==0)
                res+=arr[i]/b;
            else res+=arr[i]/b+1;
        }
        System.out.println(res);
        System.out.println(a/c+" "+a%c);
    }
}
