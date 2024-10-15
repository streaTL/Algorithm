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
        int[] arr = new int[a];
        st=new StringTokenizer(br.readLine());
        boolean[] arr3 = new boolean[1000001];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            arr3[arr[i]]=true;
        }
        int[]arr2 = new int[1000001];

        int x;
        int c;
        for(int i=0;i<a;i++){
            c=2;
            x=arr[i]*c;
            while(x<=1000000){
                if(arr3[arr[i]*c]){
                    arr2[arr[i]]++;
                    arr2[arr[i]*c]--;
                }
                c++;
                x=arr[i]*c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            sb.append(arr2[arr[i]]).append(" ");
        }
        System.out.println(sb);
    }
}
