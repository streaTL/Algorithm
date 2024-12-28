import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1;i<50;i++){
            for(int j=0;j<i;j++){
                ar.add(i);
            }
        }
        int res=0;
        for(int i=a-1;i<b;i++){
            res+=ar.get(i);
        }
        System.out.println(res);
    }
}
