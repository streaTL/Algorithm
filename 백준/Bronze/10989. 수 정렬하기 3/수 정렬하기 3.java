import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i:arr)
            sb.append(i+"\n");
        System.out.println(sb);
    }
}
