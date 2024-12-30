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
        int a = Integer.parseInt(br.readLine());

        for(int i=1;i<=a;i++){
            int b = Integer.parseInt(br.readLine());
            String s1 = br.readLine();
            String s2 = br.readLine();
            int res=0;
            for(int j=0;j<b;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    res++;
                }
            }
            System.out.println("Case "+i+": "+res);
        }
    }
}
