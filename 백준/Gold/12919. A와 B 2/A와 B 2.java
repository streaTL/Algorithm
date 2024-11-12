import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int x=0;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        dfs(a,b);
        System.out.println(x);
    }

    private static void dfs(String a, String b){
        if(a.equals(b)){
            x=1;
            return;
        }
        if(a.length()==b.length())
            return;
        if(b.charAt(0)=='B'){
            sb=new StringBuilder(b.substring(1));
            sb.reverse();
            dfs(a,sb.toString());
        }

        if(b.charAt(b.length()-1)=='A')
            dfs(a,b.substring(0,b.length()-1));
    }

}
