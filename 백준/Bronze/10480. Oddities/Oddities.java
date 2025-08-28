import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            int x = Integer.parseInt(br.readLine());
            System.out.println(x%2!=0?x+" is odd":x+" is even");
        }

    }
}
