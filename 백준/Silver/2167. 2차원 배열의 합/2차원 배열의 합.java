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
        int[][] arr = new int[a+1][b+1];
        for(int i=1;i<=a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=b;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int c = Integer.parseInt(br.readLine());
        for(int i=0;i<c;i++){
            int res=0;
            st=new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            for(int j=q;j<=e;j++){
                for(int k=w;k<=r;k++){
                    res+=arr[j][k];
                }
            }
            System.out.println(res);
        }
    }
}
