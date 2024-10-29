import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static char[] cr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
    static StringBuilder sb = new StringBuilder();
    static int res=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<String>hs = new HashSet<>();
        dfs(0,b,"");
        System.out.println(sb);
    }
    public static void dfs(int a, int b, String s){
        if(a==14)
            return;
        if(res==b)
            return;
        for(int i=0;i<cr.length;i++){
            if(res==b)
                return;
            sb.append(s+cr[i]).append(" ");
            res++;
//            System.out.println(sb);
            dfs(a+1,b,s+cr[i]);
        }

    }
}
