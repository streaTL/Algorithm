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
        StringTokenizer st = new StringTokenizer("");
        int res=0;
        int x=0;
        int y=0;
        for(int i=1;i<=9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++){
                int a = Integer.parseInt(st.nextToken());
                if(a>=res){
                    res=a;
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(res);
        System.out.println(x+" "+y);
    }
}
