import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        for(int i=0;i<15;i++){
            arr[0][i]=i;
        }
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                int x=0;
                for(int k=1;k<=j;k++){
                    x+=arr[i-1][k];
                }
                arr[i][j]=x;
            }
        }

        for(int i=0;i<t;i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(arr[a][b]);
        }
    }
}
