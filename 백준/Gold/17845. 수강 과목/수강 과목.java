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

        int[] arr = new int[a+1];
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int[] arr2 = new int[a+1];
            for(int j=0;j<=a;j++){
                arr2[j]=arr[j];
            }
            for(int j=0;j<=a-x;j++){
                if(y+arr[j]>arr[x+j])
                    arr2[x+j]=y+arr[j];
            }
            for(int j=0;j<=a;j++){
                arr[j]=arr2[j];
            }
        }
        System.out.println(arr[a]);
    }
}
