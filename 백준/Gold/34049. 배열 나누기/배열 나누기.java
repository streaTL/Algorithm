import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> ar = new ArrayList<>();
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(x>=0){
                ar.add(x);
            }
            else{
                while(true){
                    if(ar.isEmpty()){
                        System.out.println(-1);
                        return;
                    }
                    if(ar.get(ar.size()-1)>=Math.abs(x)){
                        x=ar.get(ar.size()-1)+x;
                        ar.remove(ar.size()-1);
                        ar.add(x);
                        break;
                    }
                    else{
                        x+=ar.get(ar.size()-1);
                        ar.remove(ar.size()-1);
                    }
                }
            }
        }
        System.out.println(ar.size());
    }
}
