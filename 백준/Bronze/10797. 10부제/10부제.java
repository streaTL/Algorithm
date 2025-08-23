import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res=0;
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())==a)
                res++;
        }
        System.out.println(res);

    }
}
