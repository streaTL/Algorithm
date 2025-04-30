import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int[] arr = {9,8,7,6,5,4,3,2,1,0};
    static List<Long> ar = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        dfs(0,0);
        Collections.sort(ar);
        if(ar.size()>=a)
            System.out.println(ar.get(a-1));
        else System.out.println(-1);

    }
    static void dfs(long a, int b){
        if(!ar.contains(a))
            ar.add(a);
        if(b>=10)
            return;
        dfs(a*10+arr[b],b+1);
        dfs(a,b+1);
    }
}
