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

        int[][]arr2 = new int[a][2];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr2[i][0]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        int sum=0;
        for(int i=0;i<a;i++){
            arr2[i][1]=Integer.parseInt(st.nextToken());
            sum+=arr2[i][1];
        }
//        System.out.println(sum);
//        Arrays.sort(arr2,(x,y)->x[1]==y[1]?y[0]-x[0]:x[1]-y[1]);

        int[] arr = new int[sum+1];
        Arrays.fill(arr, 0);
//        arr[0]=0;

        for(int i=0;i<a;i++){
            for(int j=sum;j>=arr2[i][1];j--){
                arr[j]=Math.max(arr[j],arr[j-arr2[i][1]]+arr2[i][0]);
            }
        }

        for(int i=0;i<=sum;i++){
            if(arr[i]>=b){
                System.out.println(i);
                return;
            }
        }
    }
}
