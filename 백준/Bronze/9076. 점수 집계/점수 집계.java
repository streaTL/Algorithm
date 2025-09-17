import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<t;i++){
            int[] arr = new int[5];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if(arr[3]-arr[1]>=4){
                System.out.println("KIN");
            }
            else
                System.out.println(arr[1]+arr[2]+arr[3]);
        }
    }
}
