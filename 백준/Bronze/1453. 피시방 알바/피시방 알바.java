import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] brr = new boolean[101];
        int res=0;
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(!brr[x]){
                brr[x]=true;
            }
            else res++;
        }
        System.out.println(res);
    }
}
