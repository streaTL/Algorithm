import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char[] arr = new char[a];
        for(int i=0;i<a;i++){
            arr[i]=br.readLine().charAt(0);
        }
        int res=0;
        for(int i=0;i<a;i++){
            if(br.readLine().charAt(0)==arr[i])
                res++;
        }
        System.out.println(res);
    }
}
