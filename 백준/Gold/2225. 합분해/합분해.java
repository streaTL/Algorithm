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
        int[][] arr = new int[b+1][a+1];
        for(int i=0;i<=b;i++){
            arr[i][0]=1;
        }

        for(int i=1; i<=b; i++){
            for(int j=0;j<=a;j++){
                arr[i][j]=arr[i-1][j];
                if(j>0)
                    arr[i][j] = (arr[i][j]+arr[i][j-1])%1000000000;
            }
        }
        System.out.println(arr[b][a]);
    }
}
