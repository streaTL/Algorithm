import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static int n = -1;
    static List<Long> ar = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<=9;i++){
            dfs(0,i,9);
        }
        Collections.sort(ar);
        if(ar.size()<=a)
            System.out.println(-1);
        else
            System.out.println(ar.get(a));
    }
    private static void dfs(long a, int b, int c){
        if(b<0){
            ar.add(a);
            return;
        }
        for(int i=c;i>=0;i--){
            dfs(a+i*(long)Math.pow(10,b),b-1,i-1);
        }
    }
}
