import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10001];
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        for(int i=4;i<=10000;i++){
            arr[i]=arr[i-3]+i/2+1;
        }
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            sb.append(arr[b]).append("\n");
        }
        System.out.println(sb);
    }
}
