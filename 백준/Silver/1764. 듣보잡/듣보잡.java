import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            hs.add(st.nextToken());
        }
        ArrayList<String> ar = new ArrayList<>();
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            if(hs.contains(x)){
                ar.add(x);
            }
        }
        Collections.sort(ar);
        System.out.println(ar.size());
        for(String i:ar){
            System.out.println(i);
        }
    }
}
