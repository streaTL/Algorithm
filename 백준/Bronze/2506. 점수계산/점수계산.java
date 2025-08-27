import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int x = 0;
        int res=0;
        while(st.hasMoreTokens()){
            int b = Integer.parseInt(st.nextToken());
            if(b==1){
                res+=x+1;
                x++;
            }
            else x=0;
        }
        System.out.println(res);
    }
}
