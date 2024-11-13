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
        int[][]arr = new int[a][3];

        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());

            for(int j=0;j<i;j++){
                if(arr[j][0]>arr[i][0]&&arr[j][1]>arr[i][1])
                    arr[i][2]++;
                else if(arr[j][0]<arr[i][0]&&arr[j][1]<arr[i][1])
                    arr[j][2]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int[] i:arr){
            sb.append(i[2]+1).append(" ");
        }
        System.out.println(sb);
    }
}
