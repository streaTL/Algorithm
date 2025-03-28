import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a%2==1){
            System.out.println(0);
            return;
        }
        int[]arr = new int[a+1];
        arr[0]=1;
        arr[2]=3;
        for(int i=4;i<=a;i+=2){
            arr[i]=arr[i-2]*4-arr[i-4];
        }
        System.out.println(arr[a]);
    }
}
